package geeksForGeeks;

//path i,i+1,i+(i%k)+!
public class MinStaminaPath {
    int minPath(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[arr.length + 1];
        int m = minRoute(arr, 1, k, dp);
        return m;
    }

    private int minRoute(int[] arr, int i, int k, int[] dp) {
        System.out.println(i);
        if (i >= arr.length + 1) {
            return 0;
        }
        if (dp[i] != 0)
            return dp[i];
        int i1 = i + (i % k) + 1;
        int i2 = i + 1;
        int min;
        if (i1 < arr.length + 1)
            min = Math.min(minRoute(arr, i2, k, dp), minRoute(arr, i1, k, dp));
        else
            min = minRoute(arr, i2, k, dp);

        return dp[i] = arr[i - 1] + min;

    }

//    min = min((i+1,N)||i+(i%k)+1)
}
