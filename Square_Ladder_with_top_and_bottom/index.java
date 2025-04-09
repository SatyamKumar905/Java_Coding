// package Square_Ladder_with_top_and_bottom;
import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of star : of ladder : ");
        int n = scn.nextInt();
        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= n; col ++){
                if(col == 1|| col == n||row % 2 == 1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
