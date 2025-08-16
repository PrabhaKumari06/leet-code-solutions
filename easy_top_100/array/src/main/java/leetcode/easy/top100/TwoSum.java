package leetcode.easy.top100;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(target - nums[i])) {
                result[0] = seen.get(target - nums[i]);
                result[1] = i;
            }
            seen.put(nums[i], i);
        }
        return result;
    }
}
