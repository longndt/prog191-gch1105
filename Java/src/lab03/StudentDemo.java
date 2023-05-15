package lab03;

//Testing class
public class StudentDemo {
    public static void main(String[] args) {
        //khai báo object cho class Student
        Student s1 = new Student("Minh",20,"minh@fpt.edu.vn");
        Student s2  = new Student("Hung", 19, "hung@fpt.edu.vn");
        Student s3 = new Student();
        s3.setName("Huong");
        s3.setAge(21);
        s3.setEmail("huong@fpt.edu.vn");
        s3.showInfo();

        //gọi method từ class Student
        s1.sayHello();
        System.out.println("I am learning at " + s1.getUniversity() + " university");
        System.out.println("I am from " + s1.getNationality());
        s2.sayHello();
        //nếu set modifier là private trong OOP class thì không truy xuất được ở class khác
        s1.showInfo();
        s2.showInfo();
        System.out.println("Name of student 1: " + s1.getName());
        System.out.println("Change name of student 1");
        s1.setName("Linh");
        System.out.println("New name of student 1: " + s1.getName());
    }
}
