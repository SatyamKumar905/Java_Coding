import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of : ");
        int n = scn.nextInt();

        for(int i = 1; i <= n; i ++){
            for(int j = n; j >= 1; j --){
                if(i <= j){
                    System.out.print(j+" ");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
