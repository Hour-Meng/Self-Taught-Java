public class NestedLoop {
    public static void main(String[] args){


        // nested loop = a loop inside of a loop

        for(int i = 1; i <= 5; i++){
            System.out.println("Outer loop: " + i);

            for(int j = 1; j <= 3; j++){
                System.out.println("    Inner loop: " + j);
         
            }
        }
    }
}
