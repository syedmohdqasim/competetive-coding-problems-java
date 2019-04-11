package HackerEarth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringContainsSameLettersTest {

    TwoStringContainsSameLetters stringComparer;

    @Before
    public void setUp() throws Exception {
        stringComparer = new TwoStringContainsSameLetters();
    }

    @Test
    public void shouldCorrectlyCompareTwoSameStrings() {
        String s1 = "abcdefghijk";
        String s2 = "abcdefghijk";

        assertTrue(stringComparer.compare(s1, s2));
    }

    @Test
    public void shouldReturnFalseOnCompareTwoDifferentStrings() {
        String s1 = "abcdefghijk";
        String s2 = "abccefghijk";

        assertFalse(stringComparer.compare(s1, s2));
    }
}