import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the oldest Number A : ");
        int A = scn.nextInt();

        System.out.println("Enter the oldest Number B : ");
        int B = scn.nextInt();

        System.out.println("Enter the oldest Number C : ");
        int C = scn.nextInt();
        
        if(A > B || B < A){
            System.out.println("A");

        } else if(C < A){
            System.out.println("B");
            
        } else {
            System.out.println("C");
        }
    }
}
