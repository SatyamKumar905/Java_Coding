import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Input : of Length :");

        double length = scn.nextDouble();
        System.out.println("Enter the input : of Breadth :");
        double breadth = scn.nextDouble();

        System.out.println("Area Of Rectangle Is : ");
        double perimeterOfRectangle = (length * breadth);
        System.out.println(perimeterOfRectangle);

        System.out.println("Perimeter Of Rectangle Is : ");
        double area_Of_Perimeter = 2 * (length + breadth);
        System.out.println(area_Of_Perimeter);

    }
    
}
