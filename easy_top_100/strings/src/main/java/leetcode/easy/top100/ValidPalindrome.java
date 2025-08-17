package leetcode.easy.top100;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.trim();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            boolean leftChar = Character.isLetterOrDigit(s.charAt(left));
            boolean rightChar = Character.isLetterOrDigit(s.charAt(right));
            if (!leftChar) left++;
            if (!rightChar) right--;
            if (leftChar && rightChar) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
