package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional.Q04_CheckString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q04_CheckStringTest {

    @Test
    public void checkIfStringHasOnlyNumbers_imperative_test1() {
        String str = "";
        boolean expected = false;
        boolean actual = Q04_CheckString.checkIfStringHasOnlyNumbers_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfStringHasOnlyNumbers_imperative_test2() {
        String str = "234567";
        boolean expected = true;
        boolean actual = Q04_CheckString.checkIfStringHasOnlyNumbers_functional(str);
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfStringHasOnlyNumbers_imperative_test3() {
        String str = "234awef567";
        boolean expected = false;
        boolean actual = Q04_CheckString.checkIfStringHasOnlyNumbers_functional(str);
        assertEquals(expected, actual);
    }
}
