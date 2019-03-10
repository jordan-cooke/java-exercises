package exercises;

import java.util.Scanner;

public class mpgCalc {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = in.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gallons = in.nextDouble();
        double mpg = (miles / gallons);
        System.out.println("Your MPG is " + mpg);
    }
}
