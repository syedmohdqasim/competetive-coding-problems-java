package HackerEarth;

import java.util.HashMap;
import java.util.Scanner;

public class FrequentPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases > 0){
            testCases--;
            input.nextLine();
            int n = input.nextInt();
            int k = input.nextInt();
            input.nextLine();
            int [] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = input.nextInt();
            }
            int mean = findMeanFrequency(numbers);
        }

    }

    private static int findMeanFrequency(int[] numbers) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int length = numbers.length;
        for (int number : numbers) {
            if (hashMap.containsKey(number)) {
                hashMap.put(number, hashMap.get(number) + 1);
            }
            else{
                hashMap.put(number, 1);
            }
        }
        Integer initialSetCount = hashMap.keySet().toArray().length;
        if(isPrime(length/initialSetCount)){

        }
        return 0;
    }
    static boolean isPrime(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

}
