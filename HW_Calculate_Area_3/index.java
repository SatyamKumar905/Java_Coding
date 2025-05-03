import java.util.*;
import java.io.*;
// package HW_Calculate_Area_3;

public class index {
    public static int LengthOfBreadth(int length, int breadth){
        int area = (length * breadth);
        return area;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            
            System.out.println("Enter the length : ");
            int length = scn.nextInt();
            System.out.println("Enter the breadth : ");
            int breadth = scn.nextInt();

          int ans = LengthOfBreadth(length, breadth);
          System.out.println(ans);
        }
    }
}
