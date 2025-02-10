import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the experience : ");
        int experience = scn.nextInt();

        System.out.println("Enter the salary : ");
        int salary = scn.nextInt();

        System.out.println("Enter the rank : ");
        int rank = scn.nextInt();

        if(experience >= 10 || salary >= 50000 || rank >= 10){
            System.out.println("You are in top management");
        }else {
            System.out.println("You are not in top management");
        }

    }
}
