// Create a base class Person
abstract class Person {

    // attributes
    private String name;
    private String age;
    private String address;

    // constructors

    // default constructor
    public Person(){
        name = "default-name";
        age = "0";
        address = "default-address";
    }

    // paramaterized constructor
    public Person(String name, String age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // getters
    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getAddress() {
        return address;
    }

    // methods
    public String displayDetails(){
        return "\nName: " + name + "\nAge: " + age + "\nAddress: " + address;
    }
}
