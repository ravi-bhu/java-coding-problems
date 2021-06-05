package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q02_FirstNonRepeatedCharTest {

    @Test
    void findFirstNonRepeatedChar_functional_test1() {
        var str = "abcdcba";
        var expected = "d";
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_functional_test2() {
        var str = "aaaaaaaaa";
        var expected = "\u0000";
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_functional_test3() {
        var str = "abcdef";
        var expected = "a";
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_functional_test4() {
        var str = "dccbba";
        var expected = "d";
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_functional(str);
        assertEquals(expected, actual);
    }
}
