import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of : ");
        int n = scn.nextInt();

        if(n % 2 == 0){
            if(n > 1000){
                System.out.println("Even and above 1000");
            }else {
                System.out.println("Even");
            }
        } if(n % 2 == 1){
            if(n > 1000){
                System.out.println("Odd and above 1000");
            }else {
                System.out.println("Odd");
            }
        }
    }
}
