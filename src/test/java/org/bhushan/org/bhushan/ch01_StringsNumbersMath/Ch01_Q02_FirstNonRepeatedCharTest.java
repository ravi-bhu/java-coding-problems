package org.bhushan.org.bhushan.ch01_StringsNumbersMath;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class Ch01_Q02_FirstNonRepeatedCharTest {

    @Test
    void findFirstNonRepeatedChar_test1() {
        var str = "abcdcba";
        var expected = Optional.of('d');
        var actual = Ch01_Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test2() {
        var str = "aaaaaaaaa";
        var expected = Optional.empty();
        var actual = Ch01_Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test3() {
        var str = "abcdef";
        var expected = Optional.of('a');
        var actual = Ch01_Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar(str);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstNonRepeatedChar_test4() {
        var str = "dccbba";
        var expected = Optional.of('d');
        var actual = Ch01_Q02_FirstNonRepeatedChar.findFirstNonRepeatedChar(str);
        assertEquals(expected, actual);
    }
}
