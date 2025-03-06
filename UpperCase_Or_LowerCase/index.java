import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Upper To Lower character : ");
        char ch = scn.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Char is Uppercase");
        }else{
            System.out.println("Char is LowerCase");
        }
    }
    
}
