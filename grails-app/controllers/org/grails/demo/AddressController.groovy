package org.grails.demo


import grails.rest.*
import grails.converters.*

class AddressController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AddressController() {
        super(Address)
    }
}
