package org.bhushan.org.bhushan.ch01_StringsNumbersMath.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q05_VowelConsonant {
    private static final List<String> vowels = List.of("a", "e", "i", "o", "u");
    private static final List<String> consonants = List.of(
            "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"
    );

    public static Map<String, Long> vowelConstant_functional(String str) {
        var vowelCount = str.codePoints()
                .mapToObj(Character::toString)
                .filter(vowels::contains)
                .count();
        var consonantCount = str.codePoints()
                .mapToObj(Character::toString)
                .filter(consonants::contains)
                .count();
        final Map<String, Long> sounds = new HashMap<>();
        sounds.put("vowels", vowelCount);
        sounds.put("consonants", consonantCount);
        return sounds;
    }
}
