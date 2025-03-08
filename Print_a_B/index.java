import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       // System.out.println("Enter the any character : ");
        for(char ch = 'a'; ch <= 'z'; ch ++){
            if(ch % 2 == 1){
                System.out.println("Small Character : " + "--"+"\t"+ ch);
            }else{
                System.out.println("Upper Character : "+ ">>"+"\t"+ (char)(ch - 32));
            }
        }
    }
}
