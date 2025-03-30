import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of stars : ");
        int n = scn.nextInt();
                                             // nested Loops;
        for(int row = 1; row <= n; row ++){        
            for(int col = 1; col <= n; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
