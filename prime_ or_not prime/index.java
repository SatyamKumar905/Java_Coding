import java.util.*;
import java.io.*;
// package prime_ or_not prime;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int j = 1; j <= t; j ++){

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        // Used Ternary Operator ;

        boolean isPrime = true;
        for(int i = 2; i < n; i ++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
         }

         if(isPrime){
            System.out.println("Prime");
           }else{
            System.out.println("Not Prime");
           }

        } 
    }
}
