public class Student extends Person {
    private static String studentId = 0;
    private String major;
    private double GPA;

    public Student(){
        studentId++;
        this.studentId = studentId;
    }

    public displayId(){
        return studentId;
    }
}
