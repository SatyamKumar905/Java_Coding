import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        int p1 = 0;
        int p2 = 1;
        int p3 = 1;

        for(int i = 1; i <= n; i ++){

            p3 = p1 + p2;
            
            p2 = p1;
            p1 = p3;

            System.out.print(p2+ "\t");
        }

    }
}

// import java.util.*;
// import java.io.*;

// public class index {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int n = scn.nextInt();

//         int p1 = 0;
//         int p2 = 1;
//         int curr = 1;

//         for(int i = 1; i <= n; i ++){
//         System.out.print(p1+ "\t");
//             p3 = p1 + p2;
//             p1 = p2;
//             p2 = curr;
//         }
//     }
// }


