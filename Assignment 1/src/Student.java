public class Student extends Person {

    // https://stackoverflow.com/questions/52613765/create-unique-id-with-constructor
    private static int idCounter = 1000;
    private String studentId;

    private String major = "";
    private String GPA;

    // default constructor
    public Student(){
        major = "default-major";
        GPA = "default-gpa";
        studentId = generateStudentId();
    }

    // paramaterized constructor generated with a static variable
    public Student(String major, String GPA){
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

    public String getGPA(){
        return GPA;
    }

    // setters
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setGPA(String GPA){
        this.GPA = GPA;
    }

    // methods
    public String displayDetails(){
        // Reusing code from the Person class ^.^
        // https://www.w3schools.com/java/ref_keyword_super.asp
        return super.displayDetails() + "\nID: " + studentId + "\nMajor: " + major + "\nGPA: " + GPA;
    }

    public static String generateStudentId(){
        return "S" + idCounter++;
    }
}
