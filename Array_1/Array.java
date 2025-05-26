import java.util.*;
import java.io.*;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int j = 1; j <= t; j ++){

            System.out.println("Enter the Number of N : ");
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i ++){
                arr[i] = scn.nextInt();
                System.out.println(arr[i]);
            }
        }
    }
}
