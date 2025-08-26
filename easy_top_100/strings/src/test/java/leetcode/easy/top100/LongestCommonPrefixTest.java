package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix prefix ;

    @BeforeEach
    void setUp(){
      prefix  = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {

        String [] input = {"flower","flow","flight"};
        assertEquals("fl",prefix.longestCommonPrefix(input));
    }
    @Test
    void longestCommonPrefix_NotCommon() {
        String [] input = {"dog","racecar","car"};
        assertEquals("",prefix.longestCommonPrefix(input));
    }
}