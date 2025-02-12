// Create a base class Person
public class Person {

    // attributes
    private String name;
    private int age;
    private String address;

    // constructors
    public Person(){
        name = "default-name";
        age = 0;
        address = "default-address";
    }


    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }
}
