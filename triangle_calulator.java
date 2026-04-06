//This is a mini project that calulate the area of a triangle from the lesson of user_input

import java.util.Scanner;

public class triangle_calulator {

     public static void main(String[] args){
        

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Please enter the height: ");
        height = scanner.nextDouble();

        //calculate the area of the triangle
        area = 0.5 * width * height;

        System.out.println("The area of the Traingle is: " + area + " cm^2");

        scanner.close();
     }
}