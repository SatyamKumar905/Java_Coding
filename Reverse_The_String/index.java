import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the any Character : ");
        String str = scn.nextLine();
        System.out.println("this is a output : ");

        for(int i = str.length() - 1; i >= 0; i --){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
