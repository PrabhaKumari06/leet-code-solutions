package leetcode.easy.top100;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        if(s.length() != t.length()) return  false;
        for (char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            count.computeIfPresent(ch, (k, v) -> count.getOrDefault(k, 0) - 1);
            if (count.containsKey(ch) && count.get(ch) <= 0) count.remove(ch);
        }
        return count.isEmpty();
    }
}
