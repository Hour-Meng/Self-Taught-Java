import java.util.Random;

public class random_number {
    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(1,10); // this will generate the number from 1 to 9 and not 10

        System.out.println(num);
        
    }
}
