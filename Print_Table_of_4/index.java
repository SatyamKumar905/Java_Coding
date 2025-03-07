import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the table of 4 : ");
        int n = scn.nextInt();

        System.out.println("table of formateing 4 : ");
        for(int i = 1; i <= n; i ++){
            System.out.println("4x" + i + "=" + (i * 4));
        }
    }
}