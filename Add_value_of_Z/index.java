import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of X : ");
        int x = scn.nextInt();

        System.out.println("Enter the value of Y : ");
        int y = scn.nextInt();
        
        System.out.println("Enter the value of Z : ");
        int z = scn.nextInt();

        if(x >= 20){
            if(y >= 100){
                z += 100;
            }else if(y < 100 || y >= 50){
                z += 50;
            }else {
                z += 10;
            }
        } if(x < 20){
            if(y >= 100){
                z += 3;
            }else if(y < 100 || y >= 50){
                z += 2;
            }else {
                z += 1;
            }
        }
        System.out.println(z);
    }
    
}
