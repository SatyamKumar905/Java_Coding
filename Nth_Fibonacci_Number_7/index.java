import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        int a = 0; int b = 1;
        int sum = 1;
        
        for(int i = 1; i <= n; i ++){
            
            sum = a + b; 
            a = b; 
            b = sum;
            System.out.println(a);
        }
       
    }
}