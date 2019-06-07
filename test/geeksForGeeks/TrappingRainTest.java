package geeksForGeeks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TrappingRainTest {

    @Test
    public void calculateWaterVolume() {
        TrappingRain trappingRain = new TrappingRain();
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(trappingRain.calculateWaterVolume(arr), 6);
    }
}