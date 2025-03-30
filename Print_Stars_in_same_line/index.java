import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of Star : ");
        int n = scn.nextInt();

        for(int i = 1; i <= n; i ++){
            System.out.print("*"+"\t");
        }
    }
}
