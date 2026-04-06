import java.util.Scanner;

public class if_statement {
    
    public static void main(String[] args) {
        int age;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        //name
        if (name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }
        
        //age
        if (age >= 18){
            System.out.println("You are 18 years old up!");

        }
        else if(age < 0){
            System.out.println("You are a troll bro!");
        }
        else{
            System.out.println("You are under 18 years old!!");
        }

        scanner.close();
    }

}
