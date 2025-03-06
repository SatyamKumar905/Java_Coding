import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of N : ");
        int n = scn.nextInt();

        for(int i = 0; i <= n; i += 7){
            System.out.println(i);
        }
    }
}
