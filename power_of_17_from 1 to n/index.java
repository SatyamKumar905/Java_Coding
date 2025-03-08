import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        long ans = 1;
        System.out.println("This output : ");

        for(int i = 1; i <= n; i ++){
            ans = ans * 17;

            System.out.print(ans+"\t");
        }
    }
}
