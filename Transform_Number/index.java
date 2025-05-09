import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Input : ");
        int n = scn.nextInt();

        for(int i = 1; i <= 2; i ++){
            int digit = n % 10;
            int rem = n / 10;
            n = digit * 10000 + rem;
        }
        System.out.println(n);
    }
    
}
