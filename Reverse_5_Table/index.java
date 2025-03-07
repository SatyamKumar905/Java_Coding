import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the table of 5 : ");
        int n = scn.nextInt();


        System.out.println("5 : table of print");
        for(int i = n; i >= 1; i --){
            System.out.println("5x"+ i + "="+ (i * 5));
        }





        // Scanner scn = new Scanner(System.in);
        
        // System.out.println("Enter the number of table formate : ");
        // int idx = scn.nextInt();


        // System.out.println("enter the num" +idx);
        // int n = scn.nextInt();
        // System.out.println("Enter the n of value  N : " + n);

        // System.out.println("table Formate : ");
        // for(int i = 1; i <= n; i ++){
        //     System.out.println(n+idx+"x"+ i + "="+ (i * n));
            
        // }
    }
}
