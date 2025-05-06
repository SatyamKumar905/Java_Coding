import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Digit : ");
        int n = scn.nextInt();
        int val = 0;
        while(n > 0){
            System.out.println("Enter the Digit : ");
            int digit = scn.nextInt();
            val = val * 10 + digit;
            n --;
            //System.out.println(val);
        }
         System.out.println(val);
    }
}
