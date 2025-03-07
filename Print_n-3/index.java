import java.util.*;
import java.io.*;
public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number N : ");
        int n = scn.nextInt();

        System.out.println("This answer : ");
        for(int i = n; i > 0; i -= 3){
            System.out.println("-->>>" + " " + i);
        }
    }
    
}
