import java.util.*;
import java.io.*; 


public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Digit : ");
        int n = scn.nextInt();
        int count = 1;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;
            count ++;
            System.out.println(digit);
            n = n / 10;
        }
        System.out.println("Total number of Digit : ");
        System.out.println("--"+" "+":"+" "+"("+count+")");
    }
    
}
