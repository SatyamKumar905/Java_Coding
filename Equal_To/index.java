import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The Number Of X : ");
        int x = scn.nextInt();

        System.out.println("Enter The Number Of  Y :");
        int y = scn.nextInt();

        System.out.println("Enter The Number Of Z : ");
        int z = scn.nextInt();

        System.out.println("Enter The Number of W : ");
        int w = scn.nextInt();

        System.out.println("Output Is : ");
        if ((x * y) == (w * z)) {
            System.out.println(true);;
        }else {
            System.out.println(false);
        }
    }
    
}
