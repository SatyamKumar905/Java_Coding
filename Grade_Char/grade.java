import java.util.*;
import java.io.*;

public class grade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the character number : ");
        char grade = scn.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent :");
                break;
            case 'B':
                System.out.println("Well done :");
                break;
            case 'C':
                System.out.println("You passed :");
                break;
            case 'E':
                System.out.println("Better luck! next time :");
                break;
            default:
                System.out.println("Not vaild :");
                break;
        }

    }
}
