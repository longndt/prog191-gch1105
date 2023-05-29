package lab07;

//sub class

public class Staff extends Employee{
    private String department;

    public Staff() {}

    public Staff(String name, int birthYear, double salary, String department) {
        super(name, birthYear, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("Hello. My name is " + super.getName() + ". My salary is $" + super.getSalary() + ". I " +
                "work" +
                " at " + department + " department");
    }
}
