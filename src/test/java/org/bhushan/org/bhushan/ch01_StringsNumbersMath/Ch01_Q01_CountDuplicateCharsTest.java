package org.bhushan.org.bhushan.ch01_StringsNumbersMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch01_Q01_CountDuplicateCharsTest {

    @Test
    void countDuplicateCharacters_test1() {
        var text = "aabbcc";
        var expected = 3;
        var actual = Ch01_Q01_CountDuplicateChars.countDuplicateCharacters(text);
        assertEquals(expected, actual, "Wrong count");
    }

    @Test
    void countDuplicateCharacters_test2() {
        var text = "abc";
        var expected = 0;
        var actual = Ch01_Q01_CountDuplicateChars.countDuplicateCharacters(text);
        assertEquals(expected, actual, "Wrong count");
    }

    @Test
    void countDuplicateCharacters_test3() {
        var text = "abcdabcdabcd";
        var expected = 8;
        var actual = Ch01_Q01_CountDuplicateChars.countDuplicateCharacters(text);
        assertEquals(expected, actual, "Wrong count");
    }
}
