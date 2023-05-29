package lab07;

//sub class (child)

//extends: kế thừa class
public class Manager extends Employee{
    private String role;

    public Manager() { }
    public Manager(String name, int birthYear, double salary, String role) {
        //super: kế thừa method
        super(name, birthYear, salary);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("Hello. My name is " + super.getName() + ". I was born in " + super.getBirthYear() + ". I am " + role);
    }
}
