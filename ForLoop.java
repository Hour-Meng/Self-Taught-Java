public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        
        // for loop = a loop that only run in a specific range

        // for (counter; condition; increment)

        for(int i = 10; i > 0 ; i--){
            System.out.println(i);
            Thread.sleep(1000); // in millisecond
        }
    }
}
