import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the any number of N : ");
        int n = scn.nextInt();
        System.out.println("Print of Even number : ");

        for(int i = 0; i <= n; i ++){
            if(i % 2 == 0){
                System.out.println("Even Number : "+ " "+ i);
            }
        }
    }
}
