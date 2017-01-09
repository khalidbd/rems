class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "home", action: "index")
//        "/"(view: "index")
        "401"(controller: 'login', action: 'auth')      //if logout button is clicked > 401 (Unauthorized) is returned...!

        "404"(controller: 'throwable', action: '_404')
        "405"(controller: 'throwable', action: '_405')
        "500"(controller: 'throwable', action: '_500')
    }
}
