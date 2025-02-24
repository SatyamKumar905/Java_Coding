import java.util.*;
import java.io.*;

public class runnerup {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
       System.out.println("Enter the First Number : ");
       int A = scn.nextInt();

       System.out.println("Enter the second number : ");
       int B = scn.nextInt();

       System.out.println("Enter the third number : ");
       int C = scn.nextInt();

       System.out.println("Second largest number IS : ");
       
       if(A > B && A > C){
         if(B > C){
            System.out.println(B);
         }else{
            System.out.println(C);
         }
       }else if(B > C){
         if(A > C){
            System.out.println(A);
         }else{
            System.out.println(C);
         }
       }else if(A > B){
         System.out.println(A);
       }else{
         System.out.println(B);
       }

   } 
}
