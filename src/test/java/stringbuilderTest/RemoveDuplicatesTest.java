package stringbuilderTest;

import org.junit.jupiter.api.Test;
import stringbuilder.RemoveDuplicates;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void testRemoveDuplicates() {
        RemoveDuplicates r = new RemoveDuplicates();
        StringBuilder s= r.removeDuplicates("aaababccc");
        assertEquals("abc", s.toString());
        StringBuilder s1= r.removeDuplicates("ttarrunnn");
        assertEquals("tarun", s1.toString());
    }

}