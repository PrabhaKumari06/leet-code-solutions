package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void containsDuplicateWithExtraSpace_ture() {
        int[] input = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicateWithExtraSpace(input));
    }

    @Test
    void containsDuplicateWithExtraSpace_false() {
        int[] input = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicateWithExtraSpace(input));
    }

    @Test
    void containsDuplicateAfterSorting_true() {
        int[] input = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicateAfterSorting(input));
    }

    @Test
    void containsDuplicateAfterSorting_false() {
        int[] input = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicateAfterSorting(input));
    }
}