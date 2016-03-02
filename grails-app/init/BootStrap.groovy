import org.grails.demo.Address
import org.grails.demo.Person

class BootStrap {

    def init = { servletContext ->

        new Person(name: 'Stanis').addToAddresses(new Address(city: 'Westeros')).addToAddresses(new Address(city: 'The Veil')).save()
        new Person(name: 'Tyrion').addToAddresses(new Address(city: 'Westeros')).addToAddresses(new Address(city: 'Castle Rock')).save()
        new Person(name: 'Eddard').addToAddresses(new Address(city: 'The North')).addToAddresses(new Address(city: 'Spoiler (Dead)')).save()

    }
    def destroy = {
    }
}
