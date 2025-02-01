import java.io.*;
import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Tax : ");
        int person = scn.nextInt();

        if(person < 500000){
            System.out.println("Not tax to be paid");
        } else {
            System.out.println("Tax to be paid");
        }
    }
    
}
