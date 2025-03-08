import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of divi.. by 3 and 5 : ");
        int n = scn.nextInt();

        System.out.println("3 and 5 divi..");
        for(int i = 1; i <= n; i ++){
            if(i % 5 == 0 || i % 3 == 0){
                System.out.println("-->>>"+" "+ i);
            }
        }
    }
}
