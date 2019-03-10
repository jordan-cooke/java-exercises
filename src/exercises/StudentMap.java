package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        Integer id = 1;
        System.out.println("Please type student name then press enter. (When done type DONE)");
        do {
            System.out.print("Enter New Student: ");
            newStudent = in.nextLine();
            if (!newStudent.equals("DONE")) {
                students.put(id, newStudent);
                id++;
            }
        } while (!newStudent.equals("DONE"));
        System.out.println(students);
    }
}
