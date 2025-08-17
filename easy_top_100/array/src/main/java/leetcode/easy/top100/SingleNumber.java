package leetcode.easy.top100;

public class SingleNumber {
    /**
     * Solution 1. Bruteforce Time Complexity O(n^2)
     * Solution 2. Sort the Array , Time Complexity O(n long n)
     * Solution 3. Use Map to hold the count , Time Complexity O(n) and Space Complexity O(n)
     * Solution 4. BitWise XOR operations, Time Complexity O(n)
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums)
            result = result ^ n;
        return result;

    }
}
