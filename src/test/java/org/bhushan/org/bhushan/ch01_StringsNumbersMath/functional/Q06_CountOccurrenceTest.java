package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q06_CountOccurrenceTest {

    @Test
    void testCountOccurrence_imperative_test1() {
        var str = "";
        var search = 'a';
        long expected = 0;
        long actual = Q06_CountOccurrence.countOccurrence_functional(str, search);
        assertEquals(expected, actual);
    }

    @Test
    void testCountOccurrence_imperative_test2() {
        var str = "aaaaaaaaaa";
        var search = 'a';
        long expected = 10;
        long actual = Q06_CountOccurrence.countOccurrence_functional(str, search);
        assertEquals(expected, actual);
    }

    @Test
    void testCountOccurrence_imperative_test3() {
        var str = "#*()^&$kasjwehpglaknmegSLKERGLKSNERG";
        var search = 'z';
        long expected = 0;
        long actual = Q06_CountOccurrence.countOccurrence_functional(str, search);
        assertEquals(expected, actual);
    }

    @Test
    void testCountOccurrence_imperative_test4() {
        var str = "abcdefghijklmnopqrstuvwxyz";
        var search = 't';
        long expected = 1;
        long actual = Q06_CountOccurrence.countOccurrence_functional(str, search);
        assertEquals(expected, actual);
    }
}
