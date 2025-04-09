// package Print_0_1_pattern;
import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of : ");
        int n = scn.nextInt();

        // outer loop
        for(int i = 1; i <= n; i ++){
            //inner loop
            for(int j = 1; j <= i; j ++){
                int sum = j + i;
                if(sum % 2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
