package com.latifbenzzine.keeplearning;

import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
    	
    	int dimes = m / 10 ;
    	int d = m % 10 ;
    	int nickle = d / 5;
    	int c = d % 5;
        return  dimes + nickle + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
        scanner.close();
    }
    
}

