package lab07;

//super class

//1. class name
public class Employee {
    //2. class attributes (variables)
    private String name;
    private int birthYear;
    private double salary;

    //3. class operations (methods)
    //constructors
    public Employee() { }
    public Employee (String name, int birthYear, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    //getters (observers)
    public String getName() {
        //return this.name;
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getSalary() {
        return salary;
    }

    //setters (mutators)
    public void setName (String name) {
        this.name = name;
    }

    public void setBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", birthYear=" + birthYear +
//                ", salary=" + salary +
//                '}';
        String employee = "Employee {name: " + name + ", birthYear: " + birthYear + ", salary: " + salary + "}";
        return employee;
    }

    public void sayHello() {
        System.out.println("Hello. My name is " + name + ". I am an employee !");
    }
}
