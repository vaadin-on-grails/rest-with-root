class UrlMappings {

    static mappings = {
        "/" {
            controller = "redirect"
        }
        // add your URL mapping to controllers
        group "/rest", {
            "/$controller/$action?/$id?"()
        }
    }
}