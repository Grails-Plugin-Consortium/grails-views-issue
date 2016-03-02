package org.grails.demo

class Person {
    String name
    static hasMany = [addresses: Address]
}
