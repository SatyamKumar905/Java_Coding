import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the value of X : ");
        int x = scn.nextInt();

        System.out.println("Enter the value of Y : ");
        int y = scn.nextInt();

        System.out.println("Enter the value of Z : ");
        int z = scn.nextInt();

        if(x % 3 == 0){
            if(y >= 200){
                z += 10;
            }else if(y >= 100){
                z += 5;
            }else if(y >= 50){
                z += 4;
            }else if(y < 50){
                z += 1;
            }
        }

        if(x % 3 != 0){
            if(y >= 200){
                z += 3;
            }else if(y >= 100){
                z += 2;
            }else if(y < 100){
                z += 1;
            }else {   
        }     
    }
        z += 10;

        System.out.println(z);
    }
}
