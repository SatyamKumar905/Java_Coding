import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number Of Sum : ");
        int x = scn.nextInt();

        System.out.println("Enter the 2nd Sum : ");
        int y = scn.nextInt();

        int sum = (x + y);

        System.out.println("Output IS : ");
        if(sum >= 100){
            System.out.println("High Sum");
        } else {
            System.out.println("Low Sum");
        }
    }
    
}
