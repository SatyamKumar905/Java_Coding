import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       System.out.println("Enter the test Case : ");
       int t = scn.nextInt();
       for(int j = 1; j <= t; j ++){

        System.out.println("Enter the Number of N : ");
        int n = scn.nextInt();
        //copy value;
        int nod = n;
        int check = n;

        // Armstrong Number :

        int count = 0;
        while (nod > 0) {
            count ++;
            nod /= 10;
        }
        System.out.println("Total Number of digit : "+count);

        int digit = 0;
        int sum = 0;
        while (n > 0) {
            int pow = 1;
            for(int i = 1; i <= count; i ++){
                digit = n % 10;
                pow = pow * digit;
            }
            sum = sum + pow;
            n /= 10;
        }
        System.out.println("Total power of Sum : "+sum);
        if(sum == check){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
       }
    }
}
