import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the input X : ");

        int x = scn.nextInt();
        System.out.println("Enter the input Y :");
        int y = scn.nextInt();

        System.out.println("Output is X + Y : ");
        int sum = (x + y);
        System.out.println(sum);

        System.out.println("Output is X - Y : ");
        int sum1 = (x - y);
        System.out.println(sum1);
    }
}
