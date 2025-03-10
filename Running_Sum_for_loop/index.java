import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        System.out.println("Enter the second number : this value : ");
        int val = scn.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i ++){
            sum = sum + val;
            System.out.print(sum+" ");
        }

    }
}