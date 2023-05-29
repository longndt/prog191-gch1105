package lab07;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Hoa");
        emp1.setSalary(888.88);
        emp1.setBirthYear(1995);

        Employee emp2 = new Employee("Tuan", 1992, 999.99);

        emp1.sayHello();
        System.out.println(emp1.toString());

        emp2.sayHello();
        System.out.println(emp2.toString());

        Manager manager = new Manager("Minh", 1991, 1499.99, "Director");
        manager.sayHello();

        Employee staff = new Staff("Quang", 1996, 499.99, "Human Resources");

        staff.sayHello();
    }
}
