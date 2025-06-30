import java.util.*;
import java.io.*;

// package Minimum_Arrays;

public class Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        System.out.println("Enter the number of Arrays of Element's : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Array's of Element :  ");
        int min = arr[0];
        for(int i = 0; i < n; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
