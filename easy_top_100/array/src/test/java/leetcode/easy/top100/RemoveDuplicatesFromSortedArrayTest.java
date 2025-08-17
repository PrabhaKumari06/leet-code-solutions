package leetcode.easy.top100;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void singleElementArrayShouldReturnOne() {
        int[] input = {1};
        assertEquals(1, removeDuplicates.removeDuplicates(input));

    }

    @Test
    void uniqueElementArray() {
        int[] input = {1, 2, 3};
        assertEquals(3, removeDuplicates.removeDuplicates(input));

    }

    @Test
    void AllDuplicateElementArray() {
        int[] input = {2, 2, 2};
        assertEquals(1, removeDuplicates.removeDuplicates(input));

    }

    @Test
    void ElementArray() {
        int[] input = {1, 2, 2, 3, 4, 4, 4};
        assertEquals(4, removeDuplicates.removeDuplicates(input));

    }
}