import java.util.*;
import java.io.*;

public class index {


    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the x of vallue : ");
        int x = scn.nextInt();
        System.out.println("Enter the y of value : ");
        int y = scn.nextInt();
        
        if(x >= 59 && y >= 10){
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        }else if(x >= 50 && y < 10){
            System.out.println("X is greater than or equal to 50 and y is less than 10");
        }else {
            System.out.println("None of the condition matches");
        }
    }
}

