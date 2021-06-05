package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q03_ReverseWordsTest {

    @Test
    void reverseWords_functional_test1() {
        String str = "hello world";
        String expected = "olleh dlrow";
        String actual = Q03_ReverseWords.reverseWords_functional(str);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void reverseWords_functional_test2() {
        String str = "who are you?";
        String expected = "ohw era ?uoy";
        String actual = Q03_ReverseWords.reverseWords_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    void reverseWords_functional_test3() {
        String str = "";
        String expected = "";
        String actual = Q03_ReverseWords.reverseWords_functional(str);
        assertEquals(expected, actual);
    }
}
