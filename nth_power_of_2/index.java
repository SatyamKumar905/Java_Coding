import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the any number : ");
        int n = scn.nextInt();
        System.out.println("This output : ");

        int ans = 1;
        for(int i = 1; i <= n; i ++){
            ans = ans * 2;
            System.out.println(ans);
        }
        // System.out.println(ans);
    }
    
}
