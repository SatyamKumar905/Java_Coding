import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range of input : ");

        int n = scn.nextInt();
        for(int i = 1; i <= n; i ++){
            System.out.println(i);
        }
    }
}
