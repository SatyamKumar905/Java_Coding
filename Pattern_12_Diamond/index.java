// package Pattern_12_Diamond;
import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of star of Diamond : ");
        int n = scn.nextInt();
        int space = n - 1;
        int star = 1;

        for(int i = 1; i <= 2 * n; i ++){             // Number of two time of ....
            for(int j = 1; j <= space; j ++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k ++){
                System.out.print("*");
            }
            System.out.println();
            if(i < n){
                space --;
                star += 2;          // increment of star and space Decrement;
            }else{
                space ++;
                star -= 2;          // Decrement of star and space increment;
            }
        }
    }
}
