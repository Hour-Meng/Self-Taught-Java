import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        // Ternary operator ?= Return 1 of 2 values if a condition is true
        
        // variable = (condition) ? if true : if false

        int score = 60;

        String passOrFail = (score > 60) ? "Pass" : "Fail";

        System.out.println(passOrFail);


        // let's make a block of code that will check odd or even with Ternary Operator
        System.out.println("\nThis program will check if your number is wether odd or even!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int number = sc.nextInt();

        String result = (number % 2 == 1) ? "Number " + number + " is an odd number!" : "Number " + number + " is an even number!";

        System.out.println(result);


        
        sc.close();

    }
}
