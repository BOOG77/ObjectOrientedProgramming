import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Student student = new Student("IT", "3.8");
        Student student2 = new Student("IT", "3.8");

        /* testing ids
        System.out.println(student.displayId());
        System.out.println(student2.displayId());
        System.out.println(student.displayDetails());
         */

        // arraylist of student ids
        ArrayList<String> students = new ArrayList<String>();
        students.add(student.getStudentId());
        students.add(student2.getStudentId());

        // System.out.println(students.get(0));

        // Start menu
        int menuSelection = 0;

        do{
            menuSelection = startMenu();
            switch(menuSelection){
                case 1: // add a new student
                    System.out.println("1- Add a new student.");
                    Scanner scanner = new Scanner(System.in);
                    // student created
                    Student student3 = new Student();

                    // user inputs students name
                    System.out.println("Enter student's name: ");
                    student3.setName(scanner.nextLine());

                    // user inputs students age
                    System.out.println("Enter student's age: ");
                    student3.setAge(scanner.nextLine());

                    // user inputs students address
                    System.out.println("Enter student's address: ");
                    student3.setAddress(scanner.nextLine());

                    // user inputs students gpa
                    System.out.println("Enter student's GPA: ");
                    student3.setGPA(scanner.nextLine());

                    // user inputs students major
                    System.out.println("Enter student's major: ");
                    student3.setMajor(scanner.nextLine());

                    // auto sets ID
                    student3.setStudentId(Student.generateStudentId());
                    break;

                case 2: // display details of all students
                    System.out.println("2- Display details of all students.");
                    break;
                case 3: // search student by id
                    System.out.println("3- Search for a student by ID.");
                    break;

                case 4: // exit case
                    // selection is set to 6 to stop the do while keeping the menu alive
                    menuSelection = 6;
                    break;
            }
        }
        while(menuSelection < 5);
        }

    public static int startMenu(){
        // variable to store user's menu selection
        int menuSelection = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your option:");
        System.out.println("====================");
        System.out.println("1- Add a new student.");
        System.out.println("2- Display details of all students.");
        System.out.println("3- Search for a student by ID.");
        System.out.println("4- Exit.");
        menuSelection = scanner.nextInt();

        // add a new student menu option
        return menuSelection;
    }
}

