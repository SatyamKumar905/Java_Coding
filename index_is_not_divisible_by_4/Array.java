import java.util.*;
import java.io.*;
// package index_is_not_divisible_by_4;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }
        for(int i = 0; i < n; i ++){
            if(i % 4 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
