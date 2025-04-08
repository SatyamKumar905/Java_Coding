import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Entre the number of star : of Pyramid : ");
        int n = scn.nextInt();
        int space = n - 1;
        int star = 1;

        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= space; j ++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k ++){
                System.out.print("* ");
            }
            System.out.println();
            space --;
            star ++;
        }
    }
}
