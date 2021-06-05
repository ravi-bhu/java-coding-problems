package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Q03_ReverseWords {
    private static final Pattern pattern = Pattern.compile("\\s+");

    public static String reverseWords_functional(String str) {
        return pattern.splitAsStream(str)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }
}
