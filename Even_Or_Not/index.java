import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter The Number IS : ");
        int n = scn.nextInt();

        System.out.println("Number IS : ");
        
        if(n % 2 == 0){
            System.out.println("Number IS Even : "+true);
        }else {
            System.out.println("Number IS Odd : " +false);
        }
    }
    
}
