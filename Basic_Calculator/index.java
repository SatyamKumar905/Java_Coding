import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the first number : ");
        int x = scn.nextInt();

        System.out.println("Enter the second number : ");
        int y = scn.nextInt();

        System.out.println("Enter the character of : ");
        char ch = scn.next().charAt(0);
        
        if(ch == 'A'){
            System.out.println(x + y);
        }else if(ch == 'S'){
            System.out.println(x - y);
        }else if(ch == 'M'){
            System.out.println(x * y);
        }else if(ch == 'D'){
            System.out.println(x / y);
        }else if(ch == 'R'){
            System.out.println(x % y);
        }else{
            System.out.println("Enter again");
        }
    }
}
