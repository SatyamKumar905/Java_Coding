// import java.util.*;
// import java.io.*;

// public class index {
//     public static int sum(int length, int breadth){
//         int ans = length * breadth;
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the length : ");
//         int length = scn.nextInt();
//         System.out.println("Enter the breadth : ");
//         int breadth = scn.nextInt();
//         System.out.print("This length * breadth : --->>> : ");
        
//         int ans = sum (length , breadth);
//         System.out.println(ans);
//     }
// }

import java.util.*;
import java.io.*;

public class index{
    public static int sum(int Length, int Breadth) {
        //return (Length * Breadth);
        int ans = (Length * Breadth);
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle : ");
        int Length = scn.nextInt();
        System.out.println("Enter the Breadth of rectangle : ");
        int Breadth = scn.nextInt();
        int val =  sum(Length, Breadth);
        System.out.println(val);
    }
}
