import java.util.*;
import java.io.*;

public class index {
    public static int findSum(int x , int y){
        int ans = (x + y);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
        System.out.println("Enter the value of X : ");
        int x = scn.nextInt();
        System.out.println("Enter the value of Y : ");
        int y = scn.nextInt();
        int ans = findSum(x, y);
        System.out.println("Add for value :  X + Y : : "+ ans);
        }
    }
}
