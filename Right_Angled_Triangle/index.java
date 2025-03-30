import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Inverted Right Triangle : ");
        int n = scn.nextInt();
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= n; col ++){
                if(col >= row){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
