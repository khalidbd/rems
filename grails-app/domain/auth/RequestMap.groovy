package auth

import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder
import org.springframework.http.HttpMethod

@ToString(cache = true, includeNames = true, includePackage = false)
class RequestMap implements Serializable {

    private static final long serialVersionUID = 1

    HttpMethod httpMethod;
    User       createdBy,
               modifiedBy;

    String     url,
               configAttribute;
    Date       dateCreated,
               dateModified;

    RequestMap(String url, String configAttribute, HttpMethod httpMethod = null) {
//        this()
        this.configAttribute = configAttribute
        this.httpMethod = httpMethod
        this.url = url
    }

    @Override
    int hashCode() {
        new HashCodeBuilder().append(configAttribute).append(httpMethod).append(url).toHashCode()
    }

    @Override
    boolean equals(other) {
        is(other) || (
                other instanceof RequestMap &&
                        other.configAttribute == configAttribute &&
                        other.httpMethod == httpMethod &&
                        other.url == url)
    }

    static constraints = {
        configAttribute nullable: false
        createdBy       nullable: false
        dateCreated     nullable: false
        url             nullable: false, unique: 'httpMethod'

        httpMethod      nullable: true
        modifiedBy      nullable: true
        dateModified    nullable: true
    }

    static mapping = {
        table    'AUTH_REQUEST_MAP'
        cache true
    }
}
