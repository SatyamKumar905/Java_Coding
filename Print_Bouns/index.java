import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the amount of salary : ");
        int salary = scn.nextInt();

        System.out.println("Enter the year : ");
        int year_of_service = scn.nextInt();

        if(year_of_service > 5){
            int bouns = salary * 5 / 100;
            System.out.println(bouns);
        }else {
            System.out.println(0);
        }
    }
}
