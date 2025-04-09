import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of table : : ");
        int n = scn.nextInt();
        System.out.println("Enter the number of k : ");
        int k = scn.nextInt();

        int space = n - 1;
        int star = 1;
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= space; j ++){
                System.out.print("   ");
            }
            for(int l = 1; l <= star; l ++){
                int val = l * k;
                System.out.print(val+" ");
            }
            System.out.println();
            space --;
            star ++;
        }
    }
}
