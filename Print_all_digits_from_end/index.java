import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the digit of nunber : ");
        int n = scn.nextInt();
        int digit = 1;
        while (n > 0) {
            digit = n % 10;
            System.out.print(digit+"\t");
            n /= 10;
        }
    }
}



                                                      // THIS SIDE FOR LOOP PROGRAM FOR TRY


// import java.util.*;
// import java.io.*;

// public class index {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         System.out.println("Enter the digit of nunber : ");
//         int n = scn.nextInt();
//         int digit = 1;
//          for(int i = n; i > 0; i /= 10){
//             digit = i % 10;
//             System.out.print(digit+"\t");
            
//         }
//     }
// }

