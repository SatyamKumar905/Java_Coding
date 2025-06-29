import java.util.*;
import java.io.*;

public class Arrays{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        //Arrays of decleare 
        System.out.println("Enter the Number of Array Element : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = scn.nextInt();

        }
        System.out.println("Maximum of Arrays : ");
        int max = arr[0];
        for(int i = 0; i < n; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}