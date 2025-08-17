package leetcode.easy.top100;

public class ReverseInteger {
    public int reverse(int x) {
        int n = Math.abs(x);
        int rev = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n /= 10;
            if ((Integer.MAX_VALUE - digit) / 10 < rev) return 0;
            rev = rev * 10 + digit;
        }
        return x < 0 ? -rev : rev;
    }
}
