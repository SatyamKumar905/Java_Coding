import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number of Input : ");
        int n = scn.nextInt();
        int space = 1;
        int star = n;

        for(int row = 1; row <= n; row ++){
            for(int i = 1; i <= space-1; i ++){
                System.out.print("\t");
            }

            for(int j = 1; j <= star; j ++){
                System.out.print("*\t");

            }
            System.out.println();
            
            if(row < (n + 1 )/ 2){
                star -= 2;
                space ++;
            }else{
                star += 2;
                space --;
            }
        }
    }
    
}
