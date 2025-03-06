import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of Series of N : ");
        int n = scn.nextInt();

        System.out.println("Number of Series : ");
        for(int i = n; i >= 1; i --){
            System.out.println(i);
        }
    }
}
