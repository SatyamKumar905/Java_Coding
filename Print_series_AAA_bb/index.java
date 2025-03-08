import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {

        System.out.println("output " );
        for(char ch = 'A'; ch <= 'Z'; ch ++){

           if(ch % 2== 1){
            System.out.print("Upper_Case"+" "+ "--"+" "+ ch);
            System.out.print(ch);
            System.out.println(ch);
           }else{
            System.out.print("Lower_Case"+" "+ ">>>"+" "+(char)(ch + 32));
            System.out.println((char)(ch + 32));

           }
        }
    }
}
