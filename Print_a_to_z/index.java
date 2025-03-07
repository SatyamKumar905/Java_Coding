import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the any character of : input :");
        char ch = scn.next().charAt(0);
        for(char idx = 'a'; idx <= 'z'; idx ++){
            System.out.println("Character of : --"+" "+ idx);
        }
    }
}
