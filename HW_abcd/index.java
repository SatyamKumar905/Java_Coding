import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int n1 = scn.nextInt();

        System.out.println("Enter the second number :");
        int n2 = scn.nextInt();

        System.out.println("Enter the third number :");
        int n3 = scn.nextInt();

        System.out.println("Enter the furth number :");
        int n4 = scn.nextInt();

        int product = ((n1)*(n2)*(n3)*(n4));
        if(product > 1000){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
