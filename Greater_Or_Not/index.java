import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int n = scn.nextInt();

        System.out.println("Output Is : ");
        if(n > 100){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
