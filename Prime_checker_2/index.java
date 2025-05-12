import java.util.*;
import java.io.*;

public class index{
    public static void IsPrime(int n){
        for(int i  = 2; i < n; i ++){
            if(n % i == 0){
                System.out.println("It is a no Prime Number ");
                System.out.println("NO");
                return;
            }
        }
        System.out.println("It is a Prime Number ");
        System.out.println("Yes");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of N : ");
            int n = scn.nextInt();

               IsPrime(n);
        }  
    }
}