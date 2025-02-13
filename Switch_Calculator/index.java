import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
       System.out.println("Enter the n of Number : ");
       int n = scn.nextInt();
       System.out.println("Enter the x of number :");
       int x = scn.nextInt();
       System.out.println("Enter the y of number :");
       int y = scn.nextInt();

       switch (n) {
        case 10:
            System.out.println(x + y);
            break;
        case 20:
            System.out.println(x - y);
            break;
        case 30:
            System.out.println(x * y);
            break;
        case 40:
            System.out.println(x % y);
            break;
        case 50:
            System.out.println(x / y);
            break;
        default:
            System.out.println("Not vaild number :");
            break;
       }
    }
}
