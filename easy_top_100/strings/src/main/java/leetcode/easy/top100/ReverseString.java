package leetcode.easy.top100;

public class ReverseString {
    public String reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(s);
    }
}
