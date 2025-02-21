import java.util.Scanner;

public class Menu {

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
