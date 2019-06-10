package geeksForGeeks;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumber() {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        MissingNumber missingNumber = new MissingNumber();
        assertEquals(6, missingNumber.missingNumber(arr));
    }
}