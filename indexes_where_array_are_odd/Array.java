import java.util.*;
import java.io.*;
// package indexes_where_array_are_odd;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of N : ");

        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }
        for(int i = 0 ; i < n; i ++){
            if(arr[i] % 2 != 0){
                System.out.println(i+" ");
            }
        }
    }
}
