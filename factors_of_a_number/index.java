import java.util.*;
import java.io.*;

public class index {
    public static void factNumber(int fact){
        for(int i = 1; i <= fact; i ++){
            if(fact % i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the number of Factors : ");
            int fact = scn.nextInt();

            factNumber(fact);
        }
    }
}
