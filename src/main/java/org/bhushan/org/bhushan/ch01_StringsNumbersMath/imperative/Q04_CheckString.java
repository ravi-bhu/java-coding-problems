package org.bhushan.org.bhushan.ch01_StringsNumbersMath.imperative;

public class Q04_CheckString {
    public static boolean checkIfStringHasOnlyNumbers_imperative(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !str.isBlank();
    }
}
