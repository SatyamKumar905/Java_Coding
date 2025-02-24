import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Character number : ");
        char ch = scn.next().charAt(0);

        if(ch >= 'a' && ch <= 'w'){
            System.out.println((char)(ch + 3));
        }else if(ch >= 'D' && ch <= 'Z'){
            System.out.println((char)(ch - 3));
        }else{
            System.out.println("Can't jump");
        }
    }
}
