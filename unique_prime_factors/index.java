import java.util.*;
import java.io.*;
// package unique_prime_factors;

public class index {
    public static boolean isprime(int n){
        for(int i = 2; i < n; i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void uniquePrimeFactor(int n){
        for(int i = 2; i < n; i ++){
            if(n % i == 0 && isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of N : ");
            int n = scn.nextInt();

            uniquePrimeFactor(n);

        }
    }
}
