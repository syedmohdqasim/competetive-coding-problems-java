package geeksForGeeks;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    int missingNumber(int[] arr) {
        int[] tempArr = new int[arr.length + 2];

        for (int i = 0; i < arr.length; i++) {
            tempArr[arr[i]] = -1;
        }
        for (int i = 1; i < tempArr.length; i++) {
            if (tempArr[i] != -1)
                return i;
        }
        return -1;
    }
}
