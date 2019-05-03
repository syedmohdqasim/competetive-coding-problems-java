package CGI;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNeighbourSumTest {
    @Test
    public void testMaxSum() {
        MaxNeighbourSum maxNeighbourSum = new MaxNeighbourSum();
        int[] arr = {-1,7,8,-5,4};
        int[][] dp = new int[10000][10000];
        assertEquals(12,maxNeighbourSum.maxSum(arr,0,arr.length-1,dp));
        maxNeighbourSum.traverseSolution(dp,arr,12,0,arr.length-1);
        System.out.println("----------------------------------------");

        System.out.println("#########################3");
        int[] arr2 = {3,2,1,-1};
        int[][] dp1 = new int[10000][10000];
        assertEquals(4,maxNeighbourSum.maxSum(arr2,0,arr2.length-1,dp1));
        maxNeighbourSum.traverseSolution(dp1,arr2,4,0,arr2.length-1);
        System.out.println("----------------------------------------");

        System.out.println("#########################");
        int[] arr3 = {11,12,-2,-1};
        int[][] dp2 = new int[10000][10000];
        assertEquals(12,maxNeighbourSum.maxSum(arr3,0,arr3.length-1,dp2));
        maxNeighbourSum.traverseSolution(dp2,arr3,12,0,arr3.length-1);
        System.out.println("----------------------------------------");

        System.out.println("#########################");
        int[] arr4 = {4,5,4,3};
        int[][] dp3 = new int[10000][10000];
        assertEquals(8,maxNeighbourSum.maxSum(arr4,0,arr4.length-1,dp3));
        maxNeighbourSum.traverseSolution(dp3,arr4,8,0,arr4.length-1);
        System.out.println("----------------------------------------");


        System.out.println("#########################5");
        int[][] dp4 = new int[10000][10000];
        int[] arr5 = {5,10,4,-1};
        assertEquals(10,maxNeighbourSum.maxSum(arr5,0,arr5.length-1,dp4));
        maxNeighbourSum.traverseSolution(dp4,arr5,10,0,arr5.length-1);
        System.out.println("----------------------------------------");

    }
}