package geeksForGeeks;

// Recursive Java program to find key closest to k
// in given Binary Search Tree.

import java.math.BigInteger;
import java.util.*;

class AGoodRange {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        BigInteger sum = BigInteger.valueOf(n + 1);
        while (m > 0) {
            m--;
            int e = sc.nextInt();
            Integer floor = treeSet.floor(e);
            Integer ceiling = treeSet.ceiling(e);
            if (ceiling != e || floor != e) {
                if (floor != null && ceiling != null) {
                    sum = sum.add(BigInteger.valueOf(e - 1));
                    sum = sum.add(BigInteger.valueOf(e + 1));
                } else if (floor != null && ceiling == null) {
                    sum = sum.add(BigInteger.valueOf(e - 1));
                    sum = sum.add(BigInteger.valueOf(floor + 1));
                } else if (floor == null && ceiling != null) {
                    sum = sum.add(BigInteger.valueOf(e + 1));
                    sum = sum.add(BigInteger.valueOf(ceiling - 1));
                }
                treeSet.add(e);
                System.out.println(sum);
            }
        }

    }
}

