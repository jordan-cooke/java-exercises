package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        String newStudent;
        System.out.println("Welcome to javaGradebook!");
        System.out.println("Enter student names. Leave blank and press enter when done.");
        do {
            newStudent = in.nextLine();
            if (!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while (!newStudent.equals(""));
        for (String student : students) {
            System.out.print("Enter grade for " + student + ": ");
            Double grade = in.nextDouble();
            grades.add(grade);
        }
        double sum = 0.0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " has a " + grades.get(i));
            sum += grades.get(i);
        }
        double avg = sum / students.size();
        System.out.println("Average across all students is " + avg);
    }
}

