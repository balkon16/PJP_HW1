package zad1.tests.unit

import groovy.test.GroovyTestCase
import zad1.Main

class TransformInputCase extends GroovyTestCase {

    void testAssertions() {
        assertTrue(Main.getTransformedInput('147') == 'jeden - cztery - siedem')
        assertTrue(Main.getTransformedInput('0') == 'zero')
        assertTrue(Main.getTransformedInput('10') == 'jeden - zero')
        assertTrue(Main.getTransformedInput('96') == 'dziewięć - sześć')
    }
}