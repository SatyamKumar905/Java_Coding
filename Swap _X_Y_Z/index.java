import java.util.*;
import java.io.*;
// package Swap _X_Y_Z;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = scn.nextInt();
        System.out.println("Enter the value of y : ");
        int y = scn.nextInt();
        System.out.println("Enter the value of z : ");
        int z = scn.nextInt();

        int temp = x;
        x = z;
        z = y;
        y = temp;
        
        System.out.println("X"+" "+"="+" "+x);
        System.out.println("Y"+" "+"="+" "+y);
        System.out.println("Z"+" "+"="+" "+z);
    }
}
