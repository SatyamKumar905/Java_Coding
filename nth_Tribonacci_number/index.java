import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enetr the number of tribonacci series : ");
        int n = scn.nextInt();
        int t0 = 0, t1 = 1, t2 = 1, t3;
        for(int i = 0; i < n; i ++){
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        System.out.println(t0);
    }
}