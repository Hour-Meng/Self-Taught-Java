public class variable{
    public static void main(String[] args){
        /*
            Variables in Java are split into 2 categories:

            1. PRIMITIVE types (store the actual value directly):
               -byte    : small integer (-128 to 127)
               -short   : medium integer (-32,768 to 32,767)
               -int     : integer (most common)
               -long    : large integer (add L at the end, e.g. 100L)
               -float   : decimal number (less precise, add F at the end, e.g. 3.14F)
               -double  : decimal number (more precise, most common for decimals)
               -char    : single character, uses '' instead of "" (e.g. 'A'), stored as a number internally
               -boolean : true or false only

            2. REFERENCE types (store a memory address pointing to the actual data):
               -String  : sequence of characters, uses "" (e.g. "hello")
               -Arrays  : collection of values (e.g. int[] nums = {1, 2, 3})
               -Objects : instances of classes (e.g. Scanner, ArrayList, your own classes)

            Key difference:
               Primitives hold the value itself.
               References hold the address of where the data lives in memory.
        */

        /*  2 steps to create a variable:
            
            -declaration
            -assignment

        */

        // int
        int num = 10; // if add float value there will be an error
        int score = 90;

        System.out.println(num);
        System.out.println(score);

        // double
        double price = 12.9;
        double height = 180;

        System.out.println(height); // even the number is not a float but since it's in double, the output is 180.0
        System.out.println(price);

        // char
        char grade = 'A';
        char dollar = '$';

        System.out.println(grade);
        System.out.println(dollar);
            // char is secretly a number it store the ASCII/Unicode of the charactor
            // if I use price + dollar it will be 48.9 instead of 12.9$
        System.out.println(price + "" + dollar); 
        System.out.println(price + String.valueOf(dollar));

        // bool
        boolean isStudent = true;
        boolean isSmart = false; // java use camel case

        System.out.println(isStudent);
        System.out.println(isSmart);
        
        // String
        String name = "Alice";
        String city = "New York";
        System.out.println("Hello " + name);
        System.out.println("You are from " + city);

    }
}