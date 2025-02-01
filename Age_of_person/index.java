import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The age : ");
        int age = scn.nextInt();

        if(age >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Below age");
        }
        
    }
    
}
