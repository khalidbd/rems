package auth

class User implements Serializable {

    private static final long serialVersionUID = 1

    transient springSecurityService

    String      username,
                password,
                fullName,
                displayName,
                phone,
                email,
                userImage,
                signature

    boolean     enabled         = true,
                accountExpired  = false,
                accountLocked   = false,
                passwordExpired = false;

    Long        createdBy,
                modifiedBy;
    Date        dateCreated = new Date(),
                dateModified;


    User(String username, String password) {
//        this()
        this.username = username
        this.password = password
    }

    @Override
    int hashCode() {
        username?.hashCode() ?: 0
    }

    @Override
    boolean equals(other) {
        is(other) || (other instanceof User && other.username == username)
    }

    @Override
    String toString() {
        username
    }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this)*.role
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

    static transients = ['springSecurityService']

    static mapping = {
        table           'AUTH_USER'
        username        column: 'USER_NAME'
        password        column: '`PASSWORD`'
        enabled         column: 'IS_ENABLED'
        accountExpired  column: 'IS_ACCOUNT_EXPIRED'
        accountLocked   column: 'IS_ACCOUNT_LOCKED'
        passwordExpired column: 'IS_PASSWORD_EXPIRED'
    }

    static constraints = {
        fullName     nullable: false;
        displayName  nullable: false;
        password     nullable: false;
        username     nullable: false, unique: true;
        dateCreated  nullable: false, display:false;
        createdBy    nullable: false, display:false;

        phone        nullable: true;
        dateModified nullable: true, display:false;
        modifiedBy   nullable: true, display:false;
        email        nullable: true, email: true;
        signature    nullable: true, validator: { val, obj ->
            if (val) {
                def ext = val.substring(val.lastIndexOf(".") + 1)
                if (ext.toLowerCase() != 'jpg'&& ext.toLowerCase() != 'jpeg' && ext.toLowerCase() != 'png') {
                    return 'user.signature.validator.invalidFileType'
                }
            } else {
                return true
            }
        }
        userImage nullable: true, validator: { val, obj ->
            if (val) {
                def ext = val.substring(val.lastIndexOf(".") + 1)
                if (ext.toLowerCase() != 'jpg'&& ext.toLowerCase() != 'jpeg' && ext.toLowerCase() != 'png') {
                    return 'user.signature.validator.invalidFileType'
                }
            } else {
                return true
            }
        }
    }
}
