package org.grails.demo


import grails.rest.*
import grails.converters.*

class PersonController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PersonController() {
        super(Person)
    }
}
