import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Height : ");
        int height = scn.nextInt();

        System.out.println("Enter the Weight : ");
        int weight = scn.nextInt();

        System.out.println("Enter the age : ");
        int age = scn.nextInt();

        if(height == 5 && weight == 50 && age == 10){
            System.out.println("Overweight");
        }else if(height == 5 || weight == 60){
            System.out.println("Fat");
        }else if(height == 6 && weight == 50){
            System.out.println("Slim");
        }else{
            System.out.println("None");
        }
    }
}
