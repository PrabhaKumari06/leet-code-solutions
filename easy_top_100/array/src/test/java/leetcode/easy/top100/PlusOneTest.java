package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    private PlusOne plusOne;

    @BeforeEach
    void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    void plusOneEndWithLessThan9() {
        int[] input = {1, 4, 6, 2};
        int[] expected = {1, 4, 6, 3};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    void plusOneEndWith9() {
        int[] input = {1, 4, 9};
        int[] expected = {1, 5, 0};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    void plusOneAll9() {
        int[] input = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }

    @Test
    void plusOneAll0() {
        int[] input = {0};
        int[] expected = {1};
        assertArrayEquals(expected, plusOne.plusOne(input));
    }
}