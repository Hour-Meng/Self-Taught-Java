import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){

        // Enhanced Switch = A replacement of many else if statements ( Java14 feature ), I'm currently using java26
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the day of the week: ");
        String day = sc.nextLine();
        // incase they type mONday or MOnday, it will format that into Monday
        day = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();

        sc.close();

        switch (day) {
            case "Monday" -> System.out.println("1st day of the week");
            case "Tuesday"-> System.out.println("2nd day of the week");
            case "Wednesday" -> System.out.println("3rd day of the week");
            case "Thursday" -> System.out.println("4th day of the week");
            case "Friday" -> System.out.println("5th day of the week");
            case "Saturday" -> System.out.println("6th day of the week");
            case "Sunday" -> System.out.println("7th day of the week");
                
            default -> System.out.println(day + " is not a day!! You troll 😡😡");
        }


    }
}
