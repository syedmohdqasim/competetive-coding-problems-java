package CGI;

import java.io.*;
import java.util.*;

import static java.util.Arrays.sort;

public class HeroesVsVillians {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i] = sc.nextInt();
            }
            sort(arr);
            sort(arr2);
            printWinner(arr,arr2);
        }

    }

    private static void printWinner(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr2[i]){
                System.out.println("LOSE");
            }
        }
        System.out.println("WIN");
    }
}

