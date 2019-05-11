package geeksForGeeks;

import java.util.Scanner;

class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int[][] dp = new int[m][n + 1];
            System.out.println(change(arr, m - 1, n, dp));
        }
    }

    static int change(int[] arr, int m, int n, int[][] dp) {

        if (n == 0) {
            return 1;
        }
        if (m < 0)
            return 0;

        if (n < 0)
            return 0;

        if (dp[m][n] > 0)
            return dp[m][n];

        return dp[m][n] = change(arr, m - 1, n, dp) + change(arr, m, n - arr[m], dp);
    }
}