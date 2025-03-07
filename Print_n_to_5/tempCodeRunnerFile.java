
public class index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number's : N : ");
        int n = scn.nextInt();

        System.out.println("This answer : ");
        for(int i = n; i >= 1; i --){
            System.out.print(i +"\t");
        }
    }
}
