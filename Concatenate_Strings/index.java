import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first str :");
        String s1 = scn.nextLine();

        System.out.println("Enter the second str : ");
        String s2 = scn.nextLine();

        System.out.println("Enter the 3rd str :");
        String s3 = scn.nextLine();

        String str = s1 + s2 + s3;

        System.out.println(str.length());
        System.out.println(str.charAt(2));


    }
}
