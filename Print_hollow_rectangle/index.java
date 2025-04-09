import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Col : ");
        int m = scn.nextInt();
        System.out.println("Enter the number of Row : ");
        int n = scn.nextInt();

        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= m; col ++){
                if(row == 1 || col == 1 || row == n || col == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
