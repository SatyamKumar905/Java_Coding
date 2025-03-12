import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of N : ");
        int n = scn.nextInt();

        int ans = 1;
        int i = 1;
        while (i <= n) {
            int product = scn.nextInt();
            ans = ans * product;
            System.out.print(ans+"\t");
            i ++;
        }
    }
}



// for loop this running sum : 

// import java.util.*;
// import java.io.*;

// public class index {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.println("Enter the number of N : ");
//         int n = scn.nextInt();

//         int ans = 1;
//         for(int i = 1; i <= n; i ++) {
//             int product = scn.nextInt();
//             ans = ans * product;
//             System.out.print(ans+"\t");
            
//         }
//     }
// }