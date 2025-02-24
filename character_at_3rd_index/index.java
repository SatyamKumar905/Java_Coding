import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the character : ");
        String str = scn.nextLine();

        if(str.length() >= 4){
            System.out.println(str.charAt(3));
        }else{
            System.out.println("Small String");
        }
    }
}
