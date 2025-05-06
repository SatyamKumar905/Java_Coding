import java.util.*;
import java.io.*;
// package Reverse-n_digit_number;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number Of Digit : ");
        int n = scn.nextInt();
        int val = 0;
        while (n > 0) {
            System.out.println("Enter the Digit : ");
            int digit = scn.nextInt();
            val = val * 10 + digit;
            n --;
        }
        System.out.println("Number of Digit of Sorted : ");
        System.out.println(val);

        int rem = 0;
        while (val > 0) {
            rem = rem * 10 + (val % 10);
            val /= 10;
        }
        System.out.println("Digit of Reversed order : ");
        System.out.println(rem);
    }
}
