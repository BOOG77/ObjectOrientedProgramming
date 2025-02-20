public class Student extends Person {

    // https://stackoverflow.com/questions/52613765/create-unique-id-with-constructor
    private static int idCounter = 1000;
    private String studentId;

    private String major;
    private double GPA;

    // default constructor
    public Student(){
        major = "default-major";
        GPA = 0;
        studentId = "default-id";
    }

    // paramaterized constructor generated with a static variable
    public Student(String major, double GPA){
        this.major = major;
        this.GPA = GPA;
        studentId = generateStudentId();
    }

    // getters
    public String getMajor(){
        return major;
    }

    public String getStudentId(){
        return studentId;
    }

    public double getGPA(){
        return GPA;
    }

    // setters
    public void setStudentId(){
        this.studentId = studentId;
    }

    public void setMajor(){
        this.major = major;
    }

    public void setGPA(){
        this.GPA = GPA;
    }

    // methods
    public String displayDetails(){
        // Reusing code from the Person class ^.^
        return super.displayDetails() + "\nID: " + studentId + "\nMajor: " + major + "\nGPA: " + GPA;
    }

    public static String generateStudentId(){
        return "S" + idCounter++;
    }

    // display method (PERSONAL USE - DELETE THIS)
    public String displayId(){
        return studentId;
    }

}
