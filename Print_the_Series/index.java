import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of N : ");
        int n = scn.nextInt();

        System.out.println("numbers of series ");
        for(int i = 3; i < n; i += 4){

            System.out.print(i+" ");
        }
    }
}
