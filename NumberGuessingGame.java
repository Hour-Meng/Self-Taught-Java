import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
        // a number guessing game

        int ranNum;
        int guessNum;
        int attempt = 0;

        int min = 1;
        int max = 10;

        Random rn = new Random();
        ranNum = rn.nextInt(min, max + 1); // this will generate the number from 1 to 10 and not 11

        
        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("Please guess the number ( 1-10 ): ");
            guessNum = sc.nextInt();

            if (guessNum < 1 || guessNum > 10){
                System.out.println("Number must be from 1 to 10!!");
            }
            else{
                attempt += 1;
            }

            
        }
        while (guessNum != ranNum);

        sc.close();

        System.out.println("Congrats! you guessed it right with " + attempt + " attempt(s)");
        System.out.println("The number is " + ranNum);

        // not gonna give you any hints lol

    }
}
