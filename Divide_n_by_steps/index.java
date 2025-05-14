import java.util.*;
import java.io.*;
// package Divide_n_by_steps;

public class index {
    public static void NumberOfSteps(int n, int steps){

        while (n % 2 == 0) {
            steps += 2;
            n /= 2;
        }
        while (n % 3 == 0) {
            steps += 3;
            n /= 3;
        }
        while (n % 5 == 0) {
            steps += 5;
            n /= 5;
        }

        System.out.println(steps);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Test case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){

            System.out.println("Enter the Number of N : ");
            int n = scn.nextInt();

            System.out.println("Enter the Number of Steps : ");
            int steps = scn.nextInt();

            NumberOfSteps(n, steps);
        }
    }
}
