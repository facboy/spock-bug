package org.facboy

import spock.lang.Specification

class RendererSpec extends Specification {

    def 'it should render a bean properly'() {
        setup:
        def b1 = new MyBean([integer: 1, string: "fun"])
        def b2 = new MyBean([integer: 2, string: "fun2"])

        expect:
        b1 == b2
    }

    def 'it should render a bean sub-class properly'() {
        setup:
        def b1 = new MySubBean([integer: 1, string: "fun"])
        def b2 = new MySubBean([integer: 2, string: "fun2"])

        expect:
        b1 == b2
    }

    def 'it should render a bean with an interface properly'() {
        setup:
        def b1 = new MyBean2([long: 1, string: "fun"])
        def b2 = new MyBean2([long: 2, string: "fun2"])

        expect:
        b1 == b2
    }

    def 'it should render a bean sub-class with an interface properly'() {
        setup:
        def b1 = new MySubBean2([long: 1, string: "fun"])
        def b2 = new MySubBean2([long: 2, string: "fun2"])

        expect:
        b1 == b2
    }
}
