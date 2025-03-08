import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Character is a input : ");
        String str = scn.nextLine();
        System.out.println("This is output : ");

        for(int i = 0; i <= str.length(); i += 2){
            System.out.print(str.charAt(i)+" ");
        }

    }
}
