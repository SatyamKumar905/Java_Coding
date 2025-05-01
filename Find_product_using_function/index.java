import java.util.*;
import java.io.*;

public class index {
    public static int findProd(int x , int y){
        int prod = 1;
        int ans = (x * y);
        int sum = ans * prod;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of Test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            System.out.println("Enter the value of X : ");
            int x = scn.nextInt();
            System.out.println("Enter the value of Y : ");
            int y = scn.nextInt();

            System.out.println("Ans The Product : ");
            int ans = findProd(x, y);
            System.out.println(ans);

        }
    }
}
