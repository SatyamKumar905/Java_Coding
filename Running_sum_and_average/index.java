import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the input : ");
        int n = scn.nextInt();
        System.out.println("this answer : ");

        int sum = 0;
        int average = 0;

        for(int i = 1; i <= n; i ++){

            sum = sum + i;
            average ++;  
        }
        System.out.println(sum);
        System.out.println(sum / average);
    }
}