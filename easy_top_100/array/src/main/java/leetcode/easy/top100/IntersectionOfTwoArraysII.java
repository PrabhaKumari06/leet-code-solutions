package leetcode.easy.top100;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap();
        for (int n : nums1) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2) {
            if (count.containsKey(n)) {
                result.add(n);
                int available = count.getOrDefault(n, 0) - 1;
                if (available == 0)
                    count.remove(n);
                else
                    count.put(n, available);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
