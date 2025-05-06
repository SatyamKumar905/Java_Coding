import java.util.*;
import java.io.*;
// package Reverse _3_digit_number;
public class index {
    public static int countOfDigit(int digit){
        int val = digit;
        int count = 0;
        while (val > 0) {
            count ++;
            val /= 10;
        }
       // System.out.println("Total number of Digit : " + count);

        return count;
    }

    public static int ReverseDigit(int n){
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            
            System.out.println("Enter the number of digit : ");
            int n = scn.nextInt();


           int ans = ReverseDigit(n);
         //  System.out.print(ans+" ");
           System.out.print("NumberOfDigit"+" ");

           int sum = countOfDigit(n);
           System.out.print(sum);

        }
    }
}
