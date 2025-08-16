package leetcode.easy.top100;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = Arrays.copyOf(digits, digits.length + 1);
        temp[0] = 1;
        return temp;

    }
}
