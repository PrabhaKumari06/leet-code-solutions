package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    private StringToInteger sToI;

    @BeforeEach
    void setUp() {
        sToI = new StringToInteger();

    }

    @Test
    void positiveDigitWithinRange() {
        assertEquals(2345, sToI.myAtoi("2345"));

    }

    @Test
    void negativeDigitWithinRange() {
        assertEquals(-123, sToI.myAtoi("-123"));

    }

    @Test
    void positiveDigitOutOfRange() {
        assertEquals(2147483647, sToI.myAtoi("91283472332"));
    }

    @Test
    void negativeDigitOutOfRange() {
        assertEquals(-2147483648, sToI.myAtoi("-91283472332"));
    }

    @Test
    void plusSigneWithDigit() {
        assertEquals(234, sToI.myAtoi("+234"));
    }

    @Test
    void digitAndLetters() {
        assertEquals(12, sToI.myAtoi("12asA"));

    }

    @Test
    void decimalIncluded() {
        assertEquals(12, sToI.myAtoi("12.1"));
    }

    @Test
    void blankInput() {
        assertEquals(0, sToI.myAtoi(""));
    }

}