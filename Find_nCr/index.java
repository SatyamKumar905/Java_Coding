import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : of : r : ");
        int r = scn.nextInt();

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();
        int ans = 1;

        for(int i = 1; i <= n; i ++){
            ans = ans * (n - r + i) / i;
        }
        System.out.println(ans);
    }
}
