import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first Character X : ");
        char x = scn.next().charAt(0);

        System.out.println("Enter the second Character of Y :");
        char y = scn.next().charAt(0);

        if(x == '0'){
            System.out.print(y - '0');
        }else{
            System.out.print(x - '0');
            System.out.println(y - '0');
        }
    }
}
