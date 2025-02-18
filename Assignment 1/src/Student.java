public class Student extends Person {

    // https://stackoverflow.com/questions/52613765/create-unique-id-with-constructor
    private static int idCounter = 1;
    private int studentId;

    private String major;
    private double GPA;

    // default constructor
    public Student(){
        major = "default-major";
        GPA = 0;
        studentId = 0;
    }

    // paramaterized constructor generated with a static variable
    public Student(String major, double GPA){
        this.major = major;
        this.GPA = GPA;
        studentId = idCounter++;
    }

    // display method
    public int displayId(){
        return studentId;
    }

    // getters
    public String getMajor(){
        return major;
    }

    public int getStudentId(){
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
}
