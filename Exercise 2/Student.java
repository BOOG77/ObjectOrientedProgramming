/*
 * Author: Dawson Brown
 * LMD: January 19 2025
 * School: NSCC
 * Course: PROG 1400 Introduction to Object Oriented Programming
 * Exercise #2
 */
public class Student {
    /*
     private is best practice, this way people aren't dealing directly with the data in other classes
     this is why you make setters and getters, so they use your method
     (this is encapsulation)
    */

    // student attributes
    private String stuName;
    private int stuAge;
    private int stuId;

    // gather all info at once method
    public String studentInfo(){
        return "====================\n" + "Student: " + stuName + "\nAge: " + stuAge + "\nID: " + stuId + "\n====================";
    }

    // add behaviour getters and setters (methods)

    // setters
    public void setName(String name){
        // this uses the object being passed into the method to assign value to name
        this.stuName = name;
    }

    public void setAge(Integer age){
        this.stuAge = age;
    }

    public void setId(Integer id){
        this.stuId = id;
    }

    // getters
    public String getName () {
        return "Student: " + stuName;
    }

    // getAge return type is set as String for decoration
    public String getAge (){
        return "Age: " + stuAge;
    }

    public String getId (){
        return  "ID: " + stuId;
    }
}
