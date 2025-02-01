import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = scn.nextInt();

        System.out.println("Enter the salary : ");
        int salary = scn.nextInt();

        if(age > 40){
            if(salary >= 30000){
                System.out.println("You are rich and adult");
            }else {
                System.out.println("You are an adult");
            }
        } 
        
        if(age <= 40){
            if(salary >= 12000){
                System.out.println("You are rich and young");
            }else {
                System.out.println("You are young");
            }
        }
    }
}
