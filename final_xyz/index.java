import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first number of X : ");
        int x = scn.nextInt();
        System.out.println("Enter the second number of Y : ");
        int y = scn.nextInt();
        System.out.println("Enter the third number of Z : ");
        int z = scn.nextInt();

        if(x >= 20 && z < 100){
            z += 200;
        }else if(x >= 10 || y < 50){
            z += 100;
        }else {
            
        }
         System.out.println(z);
    }
}
