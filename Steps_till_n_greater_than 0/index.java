import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        for(int i = 1; i <= n; i ++){
            int step = 0;
            System.out.println("Enter the test case : ");
            int t = scn.nextInt();
            while (t > 0) {
                if(t % 2 == 0){
                    t = t - 1;
                    step ++;
                }else{
                    t = t - 3;
                    step ++;
                }
            }
            System.out.println(step);
        }
    }
}