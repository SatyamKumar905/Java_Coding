import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of table : ");
        int n = scn.nextInt();

        for(int row = 1; row <= n; row ++){
            for(int col = 1; col <= n; col ++){
                if(col <= row){
                    int val = col * 5;
                    System.out.print(val+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
