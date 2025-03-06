import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of x : ");
        int x = scn.nextInt();

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        System.out.println("Number of Print : ");
        for(int i = x; i <= n; i ++){
            System.out.println(i);
        }
    }
}
