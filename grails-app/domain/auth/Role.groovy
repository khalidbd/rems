package auth

class Role implements Serializable {

    private static final long serialVersionUID = 1
    User   createdBy,
           modifiedBy

    String authority,
           description;
    Date   dateCreated,
           dateModified

    Role(String authority) {
//        this()
        this.authority = authority
    }

    @Override
    int hashCode() {
        authority?.hashCode() ?: 0
    }

    @Override
    boolean equals(other) {
        is(other) || (other instanceof Role && other.authority == authority)
    }

    @Override
    String toString() {
        authority
    }

    static mapping = {
        table 'AUTH_ROLE'
        cache true
    }

    static constraints = {
        authority    nullable: false, unique: true;
        createdBy    nullable: false, display:false;
        dateCreated  nullable: false, display:false;

        description  nullable: true, size: 1..250;
        dateModified nullable: true, display:false;
        modifiedBy   nullable: true, display:false;
    }
}
