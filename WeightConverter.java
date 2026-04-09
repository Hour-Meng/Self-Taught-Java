import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){

        double converter;
        double result;

        //weight converter pound to kilo or kilo to pound
        System.out.println("Welcome to my converter program!!\nPlease follow the instruction.\n\nOption 1(Kilo to Pound)\nOption 2(Pound to Kilo)\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Option here: ");

        int option = sc.nextInt();

        if (option == 1){
            System.out.print("Please enter the weight: ");
            converter = sc.nextDouble();

            if (converter < 0){
                System.out.println("Weight cannot be negative!!😠");
                sc.close();
                return;
            }
            result = converter * 2.204;

            System.out.printf("\nThe result of %.3f kg to pound is: %.3f lbs\n", converter, result);
            
        }
        else if (option == 2){
            System.out.print("Please enter the weight: ");
            converter = sc.nextDouble();

            if (converter < 0){
                System.out.println("Weight cannot be negative!!😠");
                sc.close();
                return;
            }

            result = converter * 0.453;

            System.out.printf("\nThe result of %.3f pounds to kg is: %.3f kg\n", converter, result);
        }
        else{
            System.out.println("You are a troll bro! 😠😠😠😠");
        }


        sc.close();
    }
}
