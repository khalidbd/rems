package common

class HomeController {
    def springSecurityService

    def index() {
//        def currentUser = (User) springSecurityService?.currentUser
//        def landingPage = currentUser?.authorities ? LandingPage.findByRoleInListAndIsActive(currentUser?.authorities, true) : null
//        if (landingPage) {
//            redirect(uri: landingPage?.pageUrl)
//            return;
//        }
    }
}
