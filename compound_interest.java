import java.util.Scanner;


public class compound_interest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + (rate/100), time);
        double interest = amount - principal;

        System.out.printf("The compound interest is: %.2f\n", interest);
        System.out.printf("The amount is: %.2f\n", amount);

        sc.close();
    }

}
