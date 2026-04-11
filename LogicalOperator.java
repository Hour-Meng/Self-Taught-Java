public class LogicalOperator {
    public static void main(String[] args) {
        
        /*  logical operator  

            && = and
            || = or
            ! = not
        
        
        */

        String name = "John";
        int age = 25;
        // let's say we want to check if the name is John and the age is 25, we can use the && operator
        if (name.equals("John") && age == 25){
            System.out.println("Welcome John!");
        }
        else{
            System.out.println("You are not John!");
        }

        // let's say we want to check if the name is John or the age is 25, we can use the || operator
        if (name.equals("John") || age == 25){
            System.out.println("Welcome John!");
        }

        // let's say we want to check if the name is not John, we can use the ! operator
        if (!name.equals("John")){
            System.out.println("You are not John!");
        }
    }
}
