import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        System.out.println("Enter the number of L : ");
        int l = scn.nextInt();

        System.out.println("Enter the number of K : ");
        int k = scn.nextInt();

        for(int i = n; i >= l; i -= k){
            System.out.print(i+"\t");
        }
    }
}