package zad1.tests.unit

import groovy.test.GroovyTestCase
import zad1.Main

class InputValidationCase extends GroovyTestCase {

    void testAssertions() {

        assertFalse("null -> Must be false", Main.isValidInput(null))
        assertFalse("empty string -> Must be false", Main.isValidInput(''))

        def testString = '12ba'
        assertFalse("$testString -> Must be false", Main.isValidInput(testString))

        testString = 'Ala ma kota'
        assertFalse("$testString -> Must be false", Main.isValidInput(testString))

        testString = '1234'
        assertTrue("$testString -> Must be true", Main.isValidInput(testString))

        testString = '0'
        assertTrue("$testString -> Must be true", Main.isValidInput(testString))
    }

}