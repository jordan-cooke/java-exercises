package exercises;

import java.util.Scanner;

public class calcRectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        double length = in.nextDouble();
        System.out.println("What is the width of your rectangle?");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
