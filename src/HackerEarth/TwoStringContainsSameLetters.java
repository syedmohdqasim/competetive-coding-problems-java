package HackerEarth;

import java.util.TreeMap;

class TwoStringContainsSameLetters {

    boolean compare(String s1, String s2) {
        TreeMap<Character, Integer> charCount = new TreeMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char key = s1.charAt(i);
            if (!charCount.containsKey(key)) {
                charCount.put(key, 1);
            } else {
                Integer integer = charCount.get(key);
                charCount.put(key, ++integer);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (charCount.containsKey(s2.charAt(i)) && charCount.get(s2.charAt(i)) <= 1) {
                Integer val = charCount.get(s2.charAt(i));
                charCount.put(s2.charAt(i), --val);
            } else {
                return false;
            }
        }

        for (Character ch : charCount.keySet()) {
            if (charCount.get(ch) != 0) {
                return false;
            }
        }

        return true;
    }
}
