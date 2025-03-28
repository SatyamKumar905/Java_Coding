import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number of X : ");
        int x = scn.nextInt();

        System.out.println("Enter the number if Y : ");
        int y = scn.nextInt();
        int step = 0;
        while (x <= y){
            x *= 5;
            if(x <= y){
                step ++;
            }
        }
        System.out.println(step);
    }
}