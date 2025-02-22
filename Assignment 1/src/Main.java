import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // making students created variable so display details of all students will display only 2 students if the 3rd isn't created
        int studentsCreated = 2;

        // students created
        Student student = new Student("IT", "3.8");
        Student student2 = new Student("IT", "3.8");
        Student student3 = new Student();

        // arraylist of student ids, used for searching student by id
        ArrayList<String> students = new ArrayList<String>();
        students.add(student.getStudentId());
        students.add(student2.getStudentId());

        // arraylist of student objects
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student2);

        // menu selection variable for later use
        int menuSelection = 0;

        // do startMenu makes it so the menu re-opens after the user does a menu function
        do{
            menuSelection = startMenu();
            // Start menu prints out the menu, and scans the user input then returns that value
            // menuSelection value is returned, and that determines what case to activate (menu functionality)
            switch(menuSelection){
                case 1: // add a new student

                    // 3 student objects are created initially to allow the user to "create" a new student.
                    // really they are filling in the details of a hidden student that is created at the start of the program.
                    if(studentsCreated == 3){
                        System.out.println("Max students created (3).");
                        break;
                    }

                    System.out.println("1- Add a new student.");
                    Scanner scanner = new Scanner(System.in);

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

                    // add to array
                    studentList.add(student3);

                    // ID is created in the constructor

                    // students created goes to 3 for display details case functionality
                    studentsCreated++;
                    break;

                case 2: // display details of all students
                    System.out.println("2- Display details of all students.");
                    System.out.println(student.displayDetails());
                    System.out.println(student2.displayDetails());

                    // if third student is created, display details
                    // by default studentsCreated will be set to 2, display details won't show the third student unless the user has already created it
                    if(studentsCreated == 3) {
                        System.out.println(student3.displayDetails());
                    }
                    break;

                case 3: // search student by id
                    scanner = new Scanner(System.in);
                    System.out.println("3- Search for a student by ID.");
                    System.out.print("Enter ID: ");
                    String idSelection = scanner.nextLine();

                    if(idSelection.equals("S1000")){
                        System.out.println(student.displayDetails());
                    }

                    if(idSelection.equals("S1001")){
                        System.out.println(student2.displayDetails());
                    }

                    if (idSelection.equals("S1002")){
                        System.out.println(student3.displayDetails());
                    }
                    break;

                case 4: // exit case
                    // selection is set to 6 to stop the do-while keeping the menu alive
                    menuSelection = 6;
                    break;

                default:
                    System.out.println("default");
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

        return menuSelection;
    }
}

