package stringbufferTest;

import org.junit.jupiter.api.Test;
import stringbuffer.StringArray;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayTest {
    @Test
    void testStringArray() {
        StringArray sa = new StringArray();
        String[] strings={"hello","world","!"};

        StringBuffer s=sa.concatenateStrings(strings);
        assertEquals("helloworld!", s.toString());
    }

}