import java.util.*;
import java.io.*;
//package Array_elements_from_1st_index;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }

        for(int i = 1; i < n; i += 2){
            System.out.println("Array of 1st index to increment : ");
            System.out.println(arr[i]);
        }
    }
}
