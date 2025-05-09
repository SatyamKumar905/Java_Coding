import java.util.*;
import java.io.*;

public class index{
    public static void RotateNumber(int n){
        for(int i = 1; i <= 3; i ++){    

            int digit = n % 10;  // 123456 -- 456123     
            int rem = n / 10;
            n = digit * 100000 + rem;

        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Test Case : ");
        int t = scn.nextInt();

        System.out.println("Enter the number of Input : ");  // 1234567 -- 7651234
        int n = scn.nextInt();
        
        
         RotateNumber(n);

    }
}