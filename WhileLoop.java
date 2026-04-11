public class WhileLoop {
    public static void main(String[] args) {
        // While loop = A statement that executes a block of code as long as its condition remains true

        int number = 1;

        while (number <= 10){
            System.out.println(number);
            number++;
        }
        System.out.println("\nThis is the do while loop\n");
        // do while loop = A statement that executes a block of code once, and then repeats the loop as long as its condition remains true
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);

    }
}
