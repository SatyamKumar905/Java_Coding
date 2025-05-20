import java.util.*;
import java.io.*;
// package Print_Primes_1;

public class Check_Prime {
    public static boolean checkPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int j = 1; j <= t; j ++){

            System.out.println("Enter the number of value of X : ");
            int x = scn.nextInt();

            System.out.println("Enter the number of value of Y : ");
            int y = scn.nextInt();

            for(int i = x; i <= y; i ++){
                int num = i;
                if(checkPrime(num)){
                    System.out.println("Prime_Number"+" "+"--"+" "+ num);
                }
            }

        }

    }
}
