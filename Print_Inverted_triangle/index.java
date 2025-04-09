// package Print_Inverted_triangle;
import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Inverted triangle : ");
        int m = scn.nextInt();
        int spaces = 0;

        for(int star = m; star >= 1; star -= 2){
            for(int space = 1; space <= spaces; space ++){
                System.out.print("\t");
            }
            for(int k = 1; k <= star; k ++){
                System.out.print("*\t");
            }
            System.out.println();
            spaces ++;
        }
    }
}
