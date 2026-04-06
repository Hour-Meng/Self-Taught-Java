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

        double price1 = 19.999;
        System.out.printf("The price is %.1f\n", price1 ); // auto round up
        System.out.printf("The price is %.2f\n", price1 ); // auto round up
        System.out.printf("The price is %.3f\n", price1 ); // display the current amount
    }
}
