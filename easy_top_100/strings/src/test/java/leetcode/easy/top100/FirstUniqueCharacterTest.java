package leetcode.easy.top100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    private  FirstUniqueCharacter uniqueCharacter;
    @BeforeEach
    void setUp(){
        uniqueCharacter = new FirstUniqueCharacter();
    }

    @Test
    void allDuplicate(){
        assertEquals(-1,uniqueCharacter.firstUniqueChar("aabb"));
    }
    @Test
    void allUnique(){
        assertEquals(0,uniqueCharacter.firstUniqueChar("abcd"));
    }

    @Test
    void someUniqueSomeDuplicate(){
        assertEquals(2,uniqueCharacter.firstUniqueChar("aadbbi"));
    }

}