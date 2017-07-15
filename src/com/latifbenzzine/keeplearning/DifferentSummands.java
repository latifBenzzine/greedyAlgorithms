package com.latifbenzzine.keeplearning;

import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        int k = n;
        int l = 1;

        while (k > 0) {

//            System.out.printf("k = %d l = %d\n", k, l);

            if (k <= 2 * l) {
                summands.add(k);
                k -= k;
            } else {
                summands.add(l);
                k -= l;
                l += 1;
            }

        }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
        scanner.close();
    }
}

