import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the character number :");
        char ch = scn.next().charAt(0);

        if(ch == 'M' || ch == 'm'){
            System.out.println("You are a male");
        }else if(ch == 'F' || ch == 'f'){
            System.out.println("You are a feamle");
        }else{
            System.out.println("Type again");
        }
    }
}
