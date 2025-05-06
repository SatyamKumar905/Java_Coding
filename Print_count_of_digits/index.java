import java.util.*;
import java.io.*;
// package Print_count_of_digits;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of digit : ");
        int n = scn.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count ++;
            // System.out.println(count);
            temp /= 10;
        }
        System.out.println("Total number of Digit count : ");
        System.out.println("\t"+"========"+" "+":"+" "+ count);

        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            System.out.println("(" + digit + ")");
            n /= 10;
        }
    }
}
