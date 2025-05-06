import java.util.*;
import java.io.*;
// package HW_Reverse_Digits;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            System.out.println("Enter the number of Digit : ");
            int n = scn.nextInt();
            int digit = 0;
            while (n > 0) {
                digit = n % 10;
                System.out.print(digit);
                n /= 10;
            }
            System.out.println();
        }

    }
}
