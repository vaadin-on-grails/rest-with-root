package app

import grails.converters.JSON

class ItemController {

    def index() {
        Map data = ['some': 'data']

        render data as JSON
    }
}
