package practice;

public class Employee {
    String name;
    double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

}
