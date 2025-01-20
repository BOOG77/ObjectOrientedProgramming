/*
 * Author: Dawson Brown
 * LMD: January 19 2025
 * School: NSCC
 * Course: PROG 1400 Introduction to Object Oriented Programming
 * Exercise #2
 */
public class Main {
    public static void main(String[] args) {
        // Creating student object
        Student student = new Student();

        // Setting student attributes
        student.setName("Boog");
        student.setAge(25);
        student.setId(9999);

        // studentInfo method
        System.out.println(student.studentInfo());

        // Getting student attributes individually
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getId());

    }
}
