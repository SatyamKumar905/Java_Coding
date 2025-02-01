import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        System.out.println("Meet Sarah ! : ");
        if(n > 1000){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    
}
