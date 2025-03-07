import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        System.out.println("This print : Multiples : ");
        for(int i = 1; i <= n; i ++){
            System.out.println("-->>"+" "+(i * 9));
        }
    }
}
