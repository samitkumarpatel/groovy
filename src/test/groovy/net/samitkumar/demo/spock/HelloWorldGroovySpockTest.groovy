package net.samitkumar.demo.spock

import spock.lang.Specification

class HelloWorldGroovySpockTest extends Specification {

    def "test 01"() {
        when:
        def x=1
        then:
        x==1
    }
}
