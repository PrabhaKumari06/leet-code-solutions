package leetcode.easy.top100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {


    @Test
    void reverseString() {
        ReverseString string = new ReverseString();
        String expected = "cba";
        char[] input = {'a' , 'b' , 'c'};
        assertEquals(expected, string.reverseString(input), "not equals");
    }
}