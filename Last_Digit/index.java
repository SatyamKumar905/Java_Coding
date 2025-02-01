import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the any Number : ");
        int first = scn.nextInt();

        System.out.println("Enter the second any number : ");
        int second = scn.nextInt();

        System.out.println("First and Second Sum of : ");
        int sum = ((first % 10) + (second % 10));
        System.out.println(sum);
    }
    
}
