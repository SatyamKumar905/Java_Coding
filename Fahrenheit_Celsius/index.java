import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Input of Fahrenheit and Celsius : ");

        double Fahrenheit = scn.nextDouble();
        System.out.println("Temp_R of Celsius : Is : ");

        double Celsius = ((Fahrenheit -32.0) * 5.0 /9.0);
        System.out.println(Celsius);
    }
    
}
