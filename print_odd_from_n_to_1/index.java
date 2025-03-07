import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the any number of N :  ");
        int n = scn.nextInt();

        System.out.println("This answer is Odd Number print : ");
        for(int i = 1; i <= n; i ++){
            if(i % 2 == 1){
                System.out.println("ODD Number : " +  i);
            }
        }
    }
    
}
