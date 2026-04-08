public class printf_method {
    public static void main(String[] args){

        //printf() = is a method used to format output
        // %[flag][width][.precision][specifier-character]
        

        /*
        Notes: 
            %s for String
            %d for int
            %f for double
            %b for boolean
        
        */
        String name = "George";
        int age = 18;

        System.out.printf("\nHello %s, you are %d years old\n", name, age);


        // precision

        /*
            + = display the sign of the number
            , = comma grouping separator
            ( = display negative numbers within parentheses
             space = leave a space for positive numbers, and display the negative sign for negative numbers
        */

        double price1 = 19.999;
        System.out.printf("The price is %.1f\n", price1 ); // auto round up
        System.out.printf("The price is %.2f\n", price1 ); // auto round up
        System.out.printf("The price is %.3f\n", price1 ); // display the current amount

        // width
        /*
            0 = pad with zeros
            number = right justify the text with the specified width
            negative number = left justify the text with the specified width
    
        
        
        */

            int n1 = 10;
            int n2 = 200;
            int n3 = 3000;
    
            System.out.printf("%d\n", n1);
            System.out.printf("%d\n", n2);
            System.out.printf("%d\n", n3);
    
            System.out.printf("%10d\n", n1); // right justify with width of 10
            System.out.printf("%10d\n", n2); // right justify with width of 10
            System.out.printf("%10d\n", n3); // right justify with width of 10
    
            System.out.printf("%-10d\n", n1); // left justify with width of 10
            System.out.printf("%-10d\n", n2); // left justify with width of 10
            System.out.printf("%-10d\n", n3); // left justify with width of 10

            System.out.printf("\n%010d\n", n1); // pad with zeros to width of 10
            System.out.printf("%010d\n", n2); // pad with zeros to width of 10
            System.out.printf("%010d\n", n3); // pad with zeros to width of 10
    }
}
