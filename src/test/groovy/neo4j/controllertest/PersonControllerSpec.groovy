package neo4j.controllertest

import grails.testing.web.controllers.ControllerUnitTest

import example.PersonController
import spock.lang.Specification

class PersonControllerSpec extends Specification implements ControllerUnitTest<PersonController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
        true == false
    }
}