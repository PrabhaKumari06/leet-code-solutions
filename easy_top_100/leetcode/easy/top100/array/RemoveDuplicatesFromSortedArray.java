package leetcode.easy.top100.array.leetcode.easy.top100.array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(" count of unique no : " + removeDuplicates(input));

    }

    public static int removeDuplicates(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                nums[++index] = nums[i];
        }
        if (nums[index] != nums[nums.length - 1])
            nums[++index] = nums[nums.length - 1];

        return index;
    }
}
