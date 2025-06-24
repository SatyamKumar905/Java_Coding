import java.util.*;
import java.io.*;
// package Product_of_Arrays_1;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }
        System.out.println("Total number of product : ");
        int prod = 1;
        for(int i = 0; i < n; i ++){
            prod = prod * arr[i];

        }
        System.out.println(prod);
    }
}
