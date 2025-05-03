import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of test Case : ");
        int t = scn.nextInt();
        for(int i = 1; i <= t; i ++){
            System.out.println("Enter the number of Odd or Even : ");
            int x = scn.nextInt();
            if(x % 2 == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
