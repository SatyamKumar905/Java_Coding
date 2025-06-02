import java.util.*;
import java.io.*;
// package two_arrays_are_identical;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        int first[] = new int[n];
        for(int i = 0; i < n; i ++){
            first[i] = scn.nextInt();
            System.out.println(first[i]);
        }

        System.out.println("Enter the number of M :");
        int m = scn.nextInt();
        if(n != m){
            System.out.println(false);
            return;
        }

        int second[] = new int[m];
        for(int i = 0; i < n; i ++){
            second[i] = scn.nextInt();
            System.out.println(second[i]);
        }

        for(int i = 0; i < n; i ++){
            if(first[i] != second[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
