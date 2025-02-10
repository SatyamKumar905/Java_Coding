import java.util.*;

public class index {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number of unit : ");
        int unit = scn.nextInt();
        int total_cost = unit * 100;

        if(total_cost > 1000){
            int discount = total_cost / 10;
            total_cost -= discount;

        }

        System.out.println("Total Discount : ");
        System.out.println(total_cost);

    }

}
