package leetcode.easy.top100;

public class StringToInteger {

    public int myAtoi(String s) {
        long result = 0;
        int sign = 1;
        int i = 0;
        s = s.trim();
        if (s.isBlank()) return 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }
        while (i < s.length()) {
            if (!Character.isDigit(s.charAt(i))) break;
            result = result * 10 + Integer.parseInt(s.charAt(i) + "");
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;

        }
        return (int) result * sign;
    }
}
