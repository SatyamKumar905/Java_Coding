import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int age = scn.nextInt();

        System.out.println("Enter the Salary : ");
        int salary = scn.nextInt();
        
        if(age > 60){
            salary = salary + 1000;
        }
        else if(age > 40 && age <= 60){
            salary = salary + 500;
        } else if(age <= 40){
           
        } else {
            
        }
         System.out.println(salary);
    }
    
}
