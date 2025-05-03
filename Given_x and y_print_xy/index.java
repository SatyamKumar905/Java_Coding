import java.util.*;
import java.io.*;
// package Given_x and y_print_xy;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of X : ");
            int x = scn.nextInt();
            System.out.println("Enter the number of Y : ");
            int y = scn.nextInt();

            System.out.print(x);
            System.out.println(y);
        }
    }
}
