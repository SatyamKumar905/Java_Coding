import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the character of String : ");
        String str = scn.nextLine();
        for(int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Print Vowels : -- >> "+ " "+ ch);
            }
        }
    }
}
