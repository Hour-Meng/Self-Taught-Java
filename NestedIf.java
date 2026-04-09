import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Are you a member? (true/false): ");
        boolean isMember = sc.nextBoolean();

        if (isStudent){
            double discount = 0.2;
            if (isMember){
                discount += 0.2;
                System.out.printf("\nYour total discount is %f", discount);
            }
            else{
                System.out.printf("\nYour total discount is %f", discount);
            }
        }
        else{
            if (isMember){
                double discount = 0.1;
                System.out.printf("\nYour total discount is %f", discount);
            }
            else{
                System.out.printf("\nYou are not eligible for a discount");
            }
        }
        
        sc.close();
    }
    
}
