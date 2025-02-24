import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Number Of character : ");
        char ch = scn.next().charAt(0);
        if(ch >= '0' && ch <= '9'){
            int ans = Character.getNumericValue(ch);
            ans = ans + 100;
            System.out.println(ans);
        }else{
            System.out.println("This is not a digit");
        }
    }
}
