package geeksForGeeks;

import java.util.Scanner;

class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int m = sc.nextInt();
            int[] arr = new int[m];
            float sum = 0;

            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int[][] dp = new int[m][(int) sum + 1];
            if (checkSubsetSum(arr, m - 1, sum, sum, dp) > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    static int checkSubsetSum(int[] arr, int m, float tempsum, float sum, int[][] dp) {
        if (m < 0) {
            return -1;
        }
        if (tempsum < 0)
            return -1;

        if (tempsum == (sum / 2)) {
            return dp[m][(int) tempsum] = 1;
        }


        if (dp[m][(int) tempsum] != 0)
            return dp[m][(int) tempsum];

        if (checkSubsetSum(arr, m - 1, tempsum, sum, dp) > 0 || checkSubsetSum(arr, m - 1, tempsum - arr[m], sum, dp) > 0)
            return dp[m][(int) tempsum] = 1;
        else
            return dp[m][(int) tempsum] = -1;
    }

}