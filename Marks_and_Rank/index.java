import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the marks : ");
        int marks = scn.nextInt();

        System.out.println("Enter the rank : ");
        int rank = scn.nextInt();

        if(marks < 20 || rank > 100){
            System.out.println("Needs improvement");
        }else if(marks < 40 || rank > 80){
            System.out.println("Concentrate");
        }else if(marks < 60 || rank > 120){
            System.out.println("Needs to focus");
        }else if(marks > 100 || rank < 10){
            System.out.println("Very good");
        }else {
            System.out.println("Bright Student");
        }
    }
}
