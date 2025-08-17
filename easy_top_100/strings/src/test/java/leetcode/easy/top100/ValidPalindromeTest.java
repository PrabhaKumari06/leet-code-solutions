package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private ValidPalindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new ValidPalindrome();
    }

    @Test
    void isPalindrome_true() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    void isPalindrome_false() {
       String input   = "race a car";
       assertFalse(palindrome.isPalindrome(input));
    }
    @Test
    void isPalindrome_emptyString() {
        String input   = " ";
        assertTrue(palindrome.isPalindrome(input));
    }
}