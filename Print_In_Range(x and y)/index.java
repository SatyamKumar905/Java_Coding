import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of X : ");
        int x = scn.nextInt();

        System.out.println("Enter the number of Y : ");
        int y = scn.nextInt();
        
        for(int i = x; i <= y; i ++){
            System.out.print(i+"\t");
        }
    }
}
