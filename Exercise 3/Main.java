/*
 * Author: Dawson Brown
 * LMD: January 25 2025
 * School: NSCC
 * Course: PROG 1400 Introduction to Object Oriented Programming
 * Exercise #3
 */
public class Main {
    public static void main(String[] args) {
        // Creating student object
            Student studentOne = new Student();

        // Setting student attributes
            studentOne.setName("Boog");
            studentOne.setAge(25);
            studentOne.setId(9999);

        // studentInfo method
            studentOne.studentInfo();

        // Getting student attributes individually
            System.out.println(studentOne.getName());
            System.out.println(studentOne.getAge());
            System.out.println(studentOne.getId());

        // Using the no-argument constructor
            Student defaultStudent = new Student();
            defaultStudent.studentInfo();

        // Using the parameterized constructor
            Student parameterizedStudent = new Student("Bob", 23, 9998);
            parameterizedStudent.studentInfo();

    }
}
