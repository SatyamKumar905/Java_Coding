import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Concatenate a : ");
        String a = scn.nextLine();
        
        System.out.println("Enter the Concatenate b : ");
        String b = scn.nextLine();

        if(a.length() >= b.length()){
            System.out.println(b + a + b);
        }else{
            System.out.println(a + b + a);
        }
    }
}
