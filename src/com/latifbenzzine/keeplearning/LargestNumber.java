package com.latifbenzzine.keeplearning;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestNumber {
    private static String largestNumber(Integer[] a) {
        
        String result = "";
        Arrays.sort(a, new Comparator<Integer>() {
        	public int compare(Integer o1, Integer o2) {
                if (o1.intValue() != o1.intValue() % 10 && o2.intValue() == o2 % 10){
                return o2.compareTo(new Integer(o1 % 10));
                }else if (o2.intValue() != o2.intValue() % 10 && o1.intValue() == o1 % 10){
                	
                    return (new Integer(o2 % 10).compareTo(o1));
                }else{
                	return o2.compareTo(o1);
                }
            }
        });
        
       
        String[] c = Stream.of(a).map(i ->i.toString()).toArray(size -> new String[ a.length ]);
        result =  Stream.of(c).collect(Collectors.joining());
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(largestNumber(a));
        scanner.close();
    }
}
