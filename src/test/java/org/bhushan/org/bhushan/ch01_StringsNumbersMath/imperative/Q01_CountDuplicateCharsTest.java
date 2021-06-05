package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q01_CountDuplicateCharsTest {

    @Test
    void countDuplicateCharacters_imperative_test1() {
        var text = "aabbcc";
        var expected = 3;
        var actual = Q01_CountDuplicateChars.countDuplicateCharacters_imperative(text);
        assertEquals(expected, actual, "Wrong count");
    }

    @Test
    void countDuplicateCharacters_imperative_test2() {
        var text = "abc";
        var expected = 0;
        var actual = Q01_CountDuplicateChars.countDuplicateCharacters_imperative(text);
        assertEquals(expected, actual, "Wrong count");
    }

    @Test
    void countDuplicateCharacters_imperative_test3() {
        var text = "abcdabcdabcd";
        var expected = 8;
        var actual = Q01_CountDuplicateChars.countDuplicateCharacters_imperative(text);
        assertEquals(expected, actual, "Wrong count");
    }
}
