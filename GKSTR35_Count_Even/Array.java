import java.util.*;
import java.io.*;

// package GKSTR35_Count_Even;

public class Array{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }
        System.out.println("Number of count : of Digit Even : ");
        int count = 0;
        for(int i = 0; i < n; i ++){
            if(arr[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
