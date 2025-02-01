import java.io.*;
import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Mark_Of_Student : ");
        int Mark_Of_Student = scn.nextInt();

        if(Mark_Of_Student > 90){
            System.out.println("Excellent.");
        }else if(Mark_Of_Student > 80 && Mark_Of_Student <= 90){
            System.out.println("Good.");
        }else if(Mark_Of_Student > 70 && Mark_Of_Student <= 80){
            System.out.println("Fair.");
        }else if(Mark_Of_Student > 60 && Mark_Of_Student <= 70){
            System.out.println("Meets Expectation's.");
        }else if(Mark_Of_Student > 40 && Mark_Of_Student <= 60){
            System.out.println("Below par.");
        }else {
            System.out.println("Faild.");
        }
    }
    
}
