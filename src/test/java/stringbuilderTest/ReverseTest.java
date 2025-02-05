package stringbuilderTest;

import org.junit.jupiter.api.Test;
import stringbuilder.Reverse;

import static org.junit.jupiter.api.Assertions.*;
class ReverseTest {
    @Test
    void testReverse() {
        String result = Reverse.reverse("tarun");

        String expected = "nurat";

        assertEquals(expected, result);
        assertEquals("ayir", Reverse.reverse("riya"));
    }
  
}