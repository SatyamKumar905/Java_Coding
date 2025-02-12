import java.util.*;
import java.io.*;

public class divisible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the N of Number : ");
        int n = scn.nextInt();

        if(n % 3 == 0 && n % 4 == 0){
            System.out.println("Divisible by 3 and 4");
        }else{
            System.out.println("Not Divisible");
        }

    }
}
