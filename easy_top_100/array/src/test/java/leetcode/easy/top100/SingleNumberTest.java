package leetcode.easy.top100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(1,
                singleNumber.singleNumber(new int[]{2, 2, 1}));
    }
    @Test
    void singleNumberWithSingleElement() {
        SingleNumber singleNumber = new SingleNumber();
        assertEquals(2,
                singleNumber.singleNumber(new int[]{2}));
    }
}