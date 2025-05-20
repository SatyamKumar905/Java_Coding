import java.util.*;
import java.io.*;
// package Find_GCD;

public class index {
    public static int findGcd(int x, int y){
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(x);
        return x;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of X : ");
            int x = scn.nextInt();

            System.out.println("Enter the number of Y : ");
            int y = scn.nextInt();

            findGcd(x , y);
        }
    }
}
