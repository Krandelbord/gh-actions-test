import spock.lang.Specification

class SomeTest extends Specification {

    void 'should work like a charm'() {
        given:
            def input = 'Some given value'
        when:
            input = 'rubbish'
        then:
            input == input
    }

    void 'should fall like a grunge'() {
        given:
            def input = 'Some given value'
        when:
            input = 'rubbish'
        then:
            input == 'some other value'
    }
}