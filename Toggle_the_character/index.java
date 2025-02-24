import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Character to numerical value : ");
        char ch = scn.next().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            int dist = ch - 'a';
            System.out.println((char)(dist + 'A'));
        }else{
            int dist = ch - 'A';
            System.out.println((char)dist + 'a');
        }
    }
}
