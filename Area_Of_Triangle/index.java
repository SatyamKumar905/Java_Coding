import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Base : ");
        double base = scn.nextDouble();

        System.out.println("Enter the Height : ");
        double height = scn.nextDouble();

        System.out.println("Area Of Base And Height Calculate IS : ");
        double area = (base * height) / 2;
        System.out.println(area);
    }
    
}
