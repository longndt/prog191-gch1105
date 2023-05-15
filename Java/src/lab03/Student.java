package lab03;

//OOP Class (without main method)
/* inside an OOP class, there are 3 components as below:
1. class name: Student
2. class attributes (variables): name, age, email
3. class operations (methods): sayHello(), showInfo()
 */
public class Student {
    //always set private for attributes => information hiding
    private String name;
    private int age;
    private String email;
    private final String university = "Greenwich";
    private String nationality;

    //set public or private for methods
    //constructor : hàm để tạo object cho class
    //(1 class có thể có 1 hoặc nhiều constructor)
    public Student (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.nationality = "Vietnam";
    }

    //empty constructor
    public Student () { }

    public String getNationality () {
        return nationality;
    }
    public String getUniversity () {
        return university;
    }

    public void sayHello() {
        System.out.println("Hello. My name is " + this.name + ". I am a student !");
        //showInfo();
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Email: " + this.email);
        System.out.println("University: " + this.university);
    }

    //getter method: get value of attribute
    public String getName () {
        //trong getter: từ khóa "this" là optional
        //return this.name;
        return name;
    }

    //setter method: change value of attribute
    public void setName (String sname) {
        //nếu tên tham số trong hàm khác với tên của attribute thì không cần từ khóa "this"
        name = sname;
    }

    public void setAge (int sage) {
        age = sage;
    }

    public void setEmail (String semail) {
        email = semail;
    }

}
