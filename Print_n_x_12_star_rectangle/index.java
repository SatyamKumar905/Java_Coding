import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of star : ");
        int n = scn.nextInt();

        for(int row = 1; row <= 12; row ++){
            for(int col = 1; col <= n; col ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
