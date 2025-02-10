import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int age = scn.nextInt();

        System.out.println("Enter the salary : ");
        int salary = scn.nextInt();

        System.out.println("Enter the Experience : ");
        int experience = scn.nextInt();

        if(age > 60 && salary > 20000 && experience > 20){
            salary += 5000;
        }else if(age > 40 && salary > 15000 && experience > 10){
            salary += 2000;
        }else if(age > 30 && salary > 10000 && experience > 5){
            salary += 1000;
        }else {
            salary += 500;
        } 
        
        System.out.println(salary);

    }
    
}
