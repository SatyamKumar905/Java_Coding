import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of : X : ");
        int x = scn.nextInt(); // 10;
        System.out.println("Enter the value of : Y : ");
        int y = scn.nextInt(); // 20;

        // x = x + y = 30; 
        // y = x - y = 10;
        // x = x - y = 20;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x"+" "+"="+" "+ x);
        System.out.println("x"+" "+"="+" "+ y);
        System.out.println("x"+" "+"="+" "+ x);
        System.out.println("x"+" "+"="+" "+ y);
        System.out.println("x"+" "+"="+" "+ x);
    }
}
