import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        int step = 0;

        while (n >= 1) {
            step ++;       //increment the step by 1;
            n /= 2;
        }
        System.out.println(step);
    }
}
