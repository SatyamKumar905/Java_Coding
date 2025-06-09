import java.util.*;
import java.io.*;
// package NON_MATCHING_NUMBER;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the numebr of N : ");
        int n = scn.nextInt();

        System.out.println("Enter the First Array : ");
        int arr1[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr1[i] = scn.nextInt();

        }
        System.out.println("Enter the Second Array : ");
        int arr2[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr2[i] = scn.nextInt();

        }
        for(int i = 0; i < n; i ++){
            if(arr1[i] != arr2[i]){
                System.out.println("NON_MATCHING_NUMBER_INDEX");
                System.out.println(i);
                return;
            }
        }
     }
}
