import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int curr;
        for(int i = 1; i <= n; i ++){
            curr = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = curr;
        }
        System.out.println(t0);
    }
}
