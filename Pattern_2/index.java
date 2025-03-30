import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of : Lower left ractangle : ");
        int n = scn.nextInt();

        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= n; col ++){
                if(col <= row){
                    System.out.print(col+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
