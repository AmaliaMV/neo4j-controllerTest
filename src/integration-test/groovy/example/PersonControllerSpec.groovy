package example

import grails.testing.gorm.DataTest
import grails.testing.web.controllers.ControllerUnitTest

import spock.lang.Specification

class PersonControllerSpec extends Specification implements ControllerUnitTest<PersonController>, DataTest {

    void setup() {
        mockDomain(Person)
    }

    def "testing get1 action response"() {
        given:
        new Person(name: 'Úrsula').save(flush:true)

        when:
        controller.get1()

        then:
        response.json.toString() == '{"name":"Úrsula","foo":"foo"}'
    }

    def "testing get2 action response"() {
        given:
        new Person(name: 'Úrsula').save(flush:true)


        when:
        controller.get2()

        then:
        response.json.toString() == '[{"name":"Úrsula","foo":"foo"},{"name":"Tiago","foo":"foo"},{"name":"Lusmila","foo":"foo"}]'
    }
}
