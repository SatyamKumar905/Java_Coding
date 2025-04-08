import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of pattern : ");
        int n = scn.nextInt();

        for(int i = n; i >= 1; i --){
            for(int j = 1; j <= n; j ++){
                if(j <= i){
                    System.out.print(j+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
