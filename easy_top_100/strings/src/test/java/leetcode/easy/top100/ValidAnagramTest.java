package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    private ValidAnagram anagram;

    @BeforeEach
    void setUp(){
        anagram = new ValidAnagram();
    }

    @Test
    void isAnagram_true() {
        assertTrue(anagram.isAnagram("anagram","nagaram"));
    }

    @Test
    void isAnagram_false() {
        assertFalse(anagram.isAnagram("rat","cat"));
    }
    @Test
    void isAnagramDiffLength_false() {
        assertFalse(anagram.isAnagram("a","cat"));
    }
}