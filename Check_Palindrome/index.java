import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            System.out.println("Enter the number of Digit : ");
            int n = scn.nextInt();
            //int digit = 0;
            int temp = n;
            int reverse = 0;
            while(n > 0){
            int digit = digit = n % 10;
             reverse = reverse * 10 + digit;
             n /= 10;
            }
            System.out.println(reverse);

            System.out.println("Check_Palidrome Number : ");
            if(temp == reverse){
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }
    }
}
