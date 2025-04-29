// import java.util.*;
// import java.io.*;

// public class index {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the A : ");
//         int a = scn.nextInt();
//         System.out.println("Enter the B : ");
//         int b = scn.nextInt();
//         System.out.println("Enter the C : ");
//         int c = scn.nextInt();

//         if(a + b > c){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//     }
// }

import java.util.*;
import java.io.*;

public class index {
    public static boolean sum(int a, int b, int c) {
        if(a + b > c){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the first Number : ");
        int a = scn.nextInt();
        System.out.println("Enter the second number : ");
        int b = scn.nextInt();
        System.out.println("Enter the third number : ");
        int c = scn.nextInt();

        boolean ans = sum(a, b, c);
        System.out.println(ans);
    }

}
