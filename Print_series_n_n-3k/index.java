import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         System.out.println("Enter the number of N : ");  
         int n = scn.nextInt(); // n = 20;

         System.out.println("Enter the number of K : ");
         int k = scn.nextInt(); // k = 1

         System.out.println("this output : ");
         for(int i = n; i > 0; i -= 3*k){
            System.out.println(i);
         }

    }
}
