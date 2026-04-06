// another mini project to get better understanding at user_input
import java.util.Scanner;

public class madlip_game {

    public static void main(String[] args){
        System.out.println("Hello! Welcome to my Mad Libs game!");
        System.out.println("Fill in the blanks — don't think too hard, just be creative!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a food: ");
        String eat = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.println();
        System.out.println("=============================================================================================");
        System.out.println("Here is your story:");
        System.out.println("\nHello, my name is " + name + " and I am " + age + " years old.");
        System.out.println("Every morning I wake up and eat a " + adjective + " " + eat + " for breakfast.");
        System.out.println("Then I go to " + place + " and have the best day ever!");

        scanner.close();

    }
}

