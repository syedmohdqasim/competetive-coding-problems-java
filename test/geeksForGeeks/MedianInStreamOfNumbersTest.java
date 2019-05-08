package geeksForGeeks;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianInStreamOfNumbersTest {

    @Test
    public void shouldReturnFirstElementAsIsForMedian() {
        MedianInStreamOfNumbers mst = new MedianInStreamOfNumbers();
        assertEquals(5, mst.streamMedian(5));
        assertEquals(10, mst.streamMedian(15));
        assertEquals(5, mst.streamMedian(1));
        assertEquals(4, mst.streamMedian(3));
        assertEquals(5, mst.streamMedian(5));
        assertEquals(5, mst.streamMedian(6));
        assertEquals(5, mst.streamMedian(7));
        assertEquals(5, mst.streamMedian(8));
        assertEquals(6, mst.streamMedian(9));
    }
}