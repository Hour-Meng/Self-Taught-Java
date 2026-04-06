// to use the user input we need to import the Scanner class
import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        // to create input we need to create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");


        //Scanner   name    = new Scanner(System.in);
        String name = scanner.nextLine(); // nextLine() is used to read a line of text (string)

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean is_student = scanner.nextBoolean();

        System.out.println("Hello " + name + " You are " + age + " years old.");

        if (is_student){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }
        scanner.close();
    }
}