public class Student extends Person {

    // https://stackoverflow.com/questions/52613765/create-unique-id-with-constructor
    private static int idCounter = 1;
    private int studentId;

    private String major;
    private double GPA;

    public Student(){
        major = "default-major";
        GPA = 0;
        studentId = 0;
    }

    public Student(String major, double GPA){
        this.major = major;
        this.GPA = GPA;
        studentId = idCounter++;
    }

    public int displayId(){
        return studentId;
    }
}
