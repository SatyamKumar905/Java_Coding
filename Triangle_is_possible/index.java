import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the A : ");
        int a = scn.nextInt();
        System.out.println("Enter the B : ");
        int b = scn.nextInt();
        System.out.println("Enter the C : ");
        int c = scn.nextInt();

        if(a + b > c){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
