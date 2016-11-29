package auth

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
@Transactional(readOnly = true)
class RoleController {

    static allowedMethods = [save: "POST", update: "PUT"]

    def springSecurityService, dateFormat, currentDate, currentUser;

    def beforeInterceptor = {
        currentDate = new Date();
        currentUser = springSecurityService.getCurrentUser();
        dateFormat  = grailsApplication.config.format.dtp.date;
    }

    //def index(Integer max) {
        //params.max = Math.min(max ?: 10, 100)
    def index() {
        respond Role.list(params), model:[roleInstanceCount: Role.count()]
    }

    def create() {
        respond new Role(params)
    }

    @Transactional
    def save(Role roleInstance) {
        if (roleInstance == null) {
            flash.error = message(code: "default.message.noRecordFound.label", default: "Error-Save-Role-L21 : Record not found...!");
            redirect(action: "create")
            return
        }

        //roleInstance.createdBy = currentUser;
        //roleInstance.validate();
        if (roleInstance.hasErrors()) {
            flash.error = "Error-Save-Role-L27 : " + roleInstance.errors
            redirect(action: "create", roleInstance: roleInstance)
            return
        }

        try {
            roleInstance.save flush:true
        }
        catch (Exception e) {
            flash.error = "Error-Save-Role-L36 : " + e
            redirect(action: "create", roleInstance: roleInstance)
            return
        }

        request.withFormat {
            form multipartForm {
                flash.success = message(code: "default.message.created", args: [message(code: "role.pageTitle.label", default: "Role"), roleInstance.id])
                redirect roleInstance
            }
            '*' { respond roleInstance, [status: CREATED] }
        }
    }

    def show(Role roleInstance) {
        respond roleInstance
    }

    def edit(Role roleInstance) {
        respond roleInstance
    }

    @Transactional
    def update(Role roleInstance) {
        if (roleInstance == null) {
            flash.error = message(code: "default.message.noRecordFound.label", default: "Error-Update-Role-L61 : Record not found...!");
            redirect(action: "update")
            return
        }

        //roleInstance.modifiedBy = currentUser;
        //roleInstance.modifiedDate = currentDate;
        //roleInstance.validate();
        if (roleInstance.hasErrors()) {
            flash.error = "Error-Update-Role-L67 : " + roleInstance.errors
            redirect(action: "update", roleInstance: roleInstance)
            return
        }

        try {
            roleInstance.save flush:true
        } catch (Exception e) {
            flash.error = "Error-Update-Role-L75 : " + e
            redirect(action: "update", roleInstance: roleInstance)
            return
        }

        request.withFormat {
            form multipartForm {
                flash.success = message(code: "default.message.updated", args: [message(code: "role.pageTitle.label", default: "Role"), roleInstance.id])
                redirect roleInstance
            }
            '*'{ respond roleInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Role roleInstance) {

        if (roleInstance == null) {
            flash.error = message(code: "default.message.noRecordFound.label", default: "Error-Delete-Role-L93 : Record not found...!");
            redirect(action: "index")
            return
        }

        try {
            roleInstance.delete flush:true
            flash.success = 'Record deleted successfully...!'
            redirect(action: "index")
            return
        }
        catch (Exception e) {
            flash.error = "Error-Delete-Role-L106 : " + e
            redirect(action: "index")
            return
        }
    }
}
