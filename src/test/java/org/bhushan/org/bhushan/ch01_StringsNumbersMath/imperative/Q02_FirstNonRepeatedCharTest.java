package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q02_FirstNonRepeatedCharTest {

    @Test
    void findFirstNonRepeatedChar_test1() {
        var str = "abcdcba";
        var expected = Optional.of('d');
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_imperative(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test2() {
        var str = "aaaaaaaaa";
        var expected = Optional.empty();
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_imperative(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test3() {
        var str = "abcdef";
        var expected = Optional.of('a');
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_imperative(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test4() {
        var str = "dccbba";
        var expected = Optional.of('d');
        var actual = Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar_imperative(str);
        assertEquals(expected, actual);
    }
}
