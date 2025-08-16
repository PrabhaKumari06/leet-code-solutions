package leetcode.easy.top100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {

    @Test
    void intersect() {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2, 2};
        IntersectionOfTwoArraysII intersection = new IntersectionOfTwoArraysII();
        assertArrayEquals(expected, intersection.intersect(nums1, nums2));
    }
}