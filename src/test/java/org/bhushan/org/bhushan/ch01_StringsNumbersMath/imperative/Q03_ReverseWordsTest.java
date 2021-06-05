package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q03_ReverseWordsTest {

    @Test
    void reverseWords_imperative_test1() {
        String str = "hello world";
        String expected = "olleh dlrow";
        String actual = Q03_ReverseWords.reverseWords_imperative(str);
        assertEquals(expected, actual);
    }
}
