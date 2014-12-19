package app

class RedirectController {

    def index() {
        redirect(uri: "/app")
    }
}
