import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int n = scn.nextInt();
        int digit = 0;
        while (n > 0){
            digit = n % 10;
            System.out.println("-->>"+"\t" + digit);
            n = n / 10;
        }
    }
}
