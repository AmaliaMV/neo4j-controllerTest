package neo4j.controllertest

import example.Person

class BootStrap {

    def init = { servletContext ->

        Person.withNewSession {
            Person.withNewTransaction {
                String name = 'Benjamín'
                if (!Person.findByName(name)) {
                    new Person(name: name).save(flush: true)
                }
            }
        }

    }
    def destroy = {
    }
}
