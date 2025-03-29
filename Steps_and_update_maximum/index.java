import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();
        int step = 0;
        int max = 0;
        for(int i = 1; i <= n; i ++){
            int ans = scn.nextInt();
            if(max < ans){
                max = ans;
                step++;
            }
        }
        System.out.println(step);
    }
}
