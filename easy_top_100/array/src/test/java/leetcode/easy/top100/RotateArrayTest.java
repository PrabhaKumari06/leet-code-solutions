package leetcode.easy.top100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    public void rotateArray() {
        RotateArray rotateArray = new RotateArray();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] rotated = rotateArray.rotate(input, k);
        assertArrayEquals(new int[] {5,6,7,1,2,3,4}, rotated);

    }

}