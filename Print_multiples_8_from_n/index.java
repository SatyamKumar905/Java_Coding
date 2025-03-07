import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int n = scn.nextInt();

        System.out.println("This answer : ");
        for(int i = n; i >= 8; i --){
            if(i % 8 == 0){
                System.out.print(i+"\t");
            }
        }
    }
}
