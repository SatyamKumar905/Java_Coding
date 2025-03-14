import java.util.*;
import java.io.*;

public class index{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number of n : ");
        int n = scn.nextInt();

        for(int i = 1; i <= n; i ++){
            if(i % 3 == 0 && i % 7 == 0){
                System.out.print("FizzBuzz"+"\t");
            }else if(i % 3 == 0){
                System.out.print("Fizz"+"\t");
            }else if(i % 7 == 0){
                System.out.print("Buzz"+"\t");
            }else{
                System.out.print(i+"\t");
            }
        }
    }
}