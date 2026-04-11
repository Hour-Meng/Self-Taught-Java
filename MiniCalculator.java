import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
         // A mini calculator project

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Welcome to my mini Calculator app!\n");

        Scanner sc = new Scanner(System.in);

            System.out.print("Please enter your first number: ");
            num1 = sc.nextDouble();

            System.out.print("Please select an operator(+, -, *, /, ^): ");
            operator = sc.next().charAt(0);

            System.out.print("Please enter your second number: ");
            num2 = sc.nextDouble();

        sc.close();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                System.out.println("\nYou can't divide by 0!!");
                validOperator = false;
            }
                else{
                    result = num1 / num2;
                }
            }

            case '^' -> result = Math.pow(num1, num2);
                
            default -> {
                System.out.println("\nGet out of here!");
                validOperator = false;
            }
        }

        // only run if the condition is met
        if (validOperator){
        System.out.printf("The result is %.2f\n", result);}

    }
}
