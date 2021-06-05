package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

public class Q04_CheckString {

    public static boolean checkIfStringHasOnlyNumbers_functional(String str) {
        return !str.isBlank() && str.codePoints()
                .allMatch(Character::isDigit);
    }
}
