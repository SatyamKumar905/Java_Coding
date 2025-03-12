import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        int i = 5;
        while (i <= n) {
            System.out.print(i+"\t");
            i += 6;
        }
    }
}
