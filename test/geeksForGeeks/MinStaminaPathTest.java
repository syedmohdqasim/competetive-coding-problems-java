package geeksForGeeks;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStaminaPathTest {

    @Test
    public void minPath() {
        int[] arr = {5, 10, 20, 15};
        MinStaminaPath minStaminaPath = new MinStaminaPath();
        System.out.println(minStaminaPath.minPath(arr, 2));
    }

    //5+10 ->15+20 \\ 15+ arr[2+1+1]
}