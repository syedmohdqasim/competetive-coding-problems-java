package geeksForGeeks;

public class TrappingRain {
    int calculateWaterVolume(int[] arr) {
        int volume = 0;
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                    left++;
                } else {
                    volume += leftMax - arr[left];
                    left++;
                }
            } else {
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                    right--;
                } else {
                    volume += rightMax - arr[right];
                    right--;
                }
            }
        }
        return volume;
    }


}
