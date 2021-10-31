package zad2.tests.unit

import groovy.test.GroovyTestCase
import zad2.Main

class TransformStringInput extends GroovyTestCase {

    void testAssertions() {
        assertTrue(Main.validateAndTransformUserInput("Bread = 10.5") == new Tuple2(true, new Tuple2("Bread", Double.valueOf(10.5))))
        assertTrue(Main.validateAndTransformUserInput("bread = 10.515156") == new Tuple2(true, new Tuple2("bread", Double.valueOf(10.515156))))
        assertTrue(Main.validateAndTransformUserInput("Jabłka = 3.12") == new Tuple2(true, new Tuple2("Jabłka", Double.valueOf(3.12))))
        assertTrue(Main.validateAndTransformUserInput("пиво = 5.99") == new Tuple2(true, new Tuple2("пиво", Double.valueOf(5.99))))
        assertTrue(Main.validateAndTransformUserInput("bread = -10") == new Tuple2(false, null))
        assertTrue(Main.validateAndTransformUserInput("10 = 10") == new Tuple2(false, null))
        assertTrue(Main.validateAndTransformUserInput("") == new Tuple2(false, null))
        assertTrue(Main.validateAndTransformUserInput("chleb = chleb") == new Tuple2(false, null))
        assertTrue(Main.validateAndTransformUserInput("chleb=10.51") == new Tuple2(false, null))
        assertTrue(Main.validateAndTransformUserInput("chleb = 10,51") == new Tuple2(false, null))
    }
}