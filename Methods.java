public class Methods{
    public static void main(String[] args){
        //methods = a block of code that is executed whenever it is called upon ( similar to functions in other programming languages but in java they are called methods )

        greetUser("John");

        System.out.println(squareNum(5.5));
    }

    // create method our of main method, called it in main
    static void greetUser(String name){
        System.out.println("Hello, " + name + "!");
    }

    // since we are returning a value, we need to change the return type from void to the type of value we are returning ( in this case double )
    static double squareNum(double num){
        return num * num;
    }
}