package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger integer;

    @BeforeEach
    void setUp() {
        integer = new ReverseInteger();

    }

    @Test
    void validWithoutExcidingLimit() {
        assertEquals(321, integer.reverse(123));
    }

    @Test
    void validExcidingLimit() {
        assertEquals(0, integer.reverse(1534236469));
    }

    @Test
    void inputEndWithZero() {
        assertEquals(421, integer.reverse(1240));
    }

}