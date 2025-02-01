import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number X : ");
        int x = scn.nextInt();

        System.out.println("Enter the number  Y : ");
        int y = scn.nextInt();
        
        System.out.println("Enter the number Z : ");
        int z = scn.nextInt();

        int sum = x + y + z;
        System.out.println("Output Is Sum : ");

        if(sum < 150){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
     }
}
