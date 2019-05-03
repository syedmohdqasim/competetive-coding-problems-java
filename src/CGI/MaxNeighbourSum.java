// program to print maximum Sum in an array wherein we cannot take sum of adjacent numbers
package CGI;
import java.io.*;
import java.util.*;

public class MaxNeighbourSum {
    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[][] dp = new int[10000][10000];
            int maxSum = maxSum(arr, 0, arr.length, dp);
            System.out.println(maxSum);
            traverseSolution(dp,arr,maxSum,0,arr.length-1);
        }
    }

    public static void traverseSolution(int[][] dp, int[] arr, int maxSum,int beg,int end) {
        if(beg>end){
            return;
        }
        if(maxSum == arr[beg]+dp[beg+2][end]){
            traverseSolution(dp,arr,dp[beg+2][end],beg+2,end);
            System.out.print(arr[beg]);
        }
        else {
            traverseSolution(dp,arr,maxSum,beg+1,end);
        }
    }

    public static int maxSum(int[] arr, int i, int length,int[][] dp) {
        if(i>length)
        return 0;
        if(dp[i][length]!=0){
//            System.out.println("dpeed");
            return dp[i][length];
        }
        int sum1 = arr[i] + maxSum(arr, i + 2, length,dp);
        int sum2 = maxSum(arr, i + 1, length,dp);
        if(sum1 > sum2){
//            System.out.print(" "+arr[i]);
            dp[i][length] = sum1;
            return sum1;
        }
        else{
            dp[i][length] = sum2;
            return sum2;
        }
    }


}