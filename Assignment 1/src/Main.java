public class Main {
    public static void main(String[] args){
        Student student = new Student("IT", 3.8);
        Student student2 = new Student("IT", 3.8);

        System.out.println(student.displayId());
        System.out.println(student2.displayId());
        System.out.println(student.displayDetails());
    }
}
