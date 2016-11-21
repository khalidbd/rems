package asfaq

class Project {
    String      projectCode,
                projectName,
                projectLocation,
                createdBy,
                modifiedBy;
    Date        projectStartDate,
                projectEndDate,
                createdDate,
                modifiedDate;
    int         noOfFloor,
                noOfFlat,
                noOfShare;
    double      pricePerShare;
    boolean     isActive;

    static mapping = {
        cache       true
        version     true
        table       'project'
    }

    static constraints = {

        projectName         nullable: false, unique: true;
        noOfFloor           nullable: false, min: 1, max: 11;
        noOfFlat            nullable: false, min: 1, max: 50;
        noOfShare           nullable: false, min: 1, max: 50;
        pricePerShare       nullable: false;
        isActive            nullable: false;
        projectLocation     nullable: true;
        createdBy           nullable: true;
        modifiedBy          nullable: true;
        projectStartDate    nullable: true;
        projectEndDate      nullable: true;
        createdDate         nullable: true;
        modifiedDate        nullable: true;

        isActive            nullable: false;

        projectCode         nullable: false, unique: true;
    }
}
