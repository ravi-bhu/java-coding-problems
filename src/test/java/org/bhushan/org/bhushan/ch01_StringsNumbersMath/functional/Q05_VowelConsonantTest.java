package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional.Q05_VowelConsonant;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Q05_VowelConsonantTest {

    @Test
    void vowelConstant_functional_test1() {
        String str = "";
        Map<String, Long> expected = new HashMap<>();
        expected.put("vowels", 0L);
        expected.put("consonants", 0L);
        assertEquals(expected, Q05_VowelConsonant.vowelConstant_functional(str));
    }

    @Test
    void vowelConstant_functional_test2() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Map<String, Long> expected = new HashMap<>();
        expected.put("vowels", 5L);
        expected.put("consonants", 21L);
        assertEquals(expected, Q05_VowelConsonant.vowelConstant_functional(str));
    }

    @Test
    void vowelConstant_functional_test3() {
        String str = "abcefg*()!";
        Map<String, Long> expected = new HashMap<>();
        expected.put("vowels", 2L);
        expected.put("consonants", 4L);
        assertEquals(expected, Q05_VowelConsonant.vowelConstant_functional(str));
    }
}
