import java.io.*;
import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the value of Diameter : ");
        int diameter = scn.nextInt();

        int redius = diameter / 2;
        System.out.println("Area of redius : ");

        int area = (22 * redius * redius) / 7;
        System.out.println(area);
    }
    
}
