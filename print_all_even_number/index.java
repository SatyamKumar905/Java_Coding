import java.util.*;
import java.io.*;

public class index {
    public static void EvenNumner(int x, int y){
        for(int i = x; i <= y; i ++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of X : ");
            int x = scn.nextInt();
            System.out.println("Enter the number of Y : ");
            int y = scn.nextInt();

            EvenNumner(x, y);

        }
    }
}
