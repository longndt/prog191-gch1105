package lab02;

import java.time.LocalDate;
import java.util.Date;

public class Method {
    public static void main(String[] args) {
       //gọi hàm
        sayHello();
        System.out.println("We are living in " + currentYear());
        welcome("Tuan Minh");
        System.out.println("3 + 5 = " + total(3,5));
    }

    //1. Hàm không có tham số và không return value (kiểu trả về: void)
    public static void sayHello () {
       System.out.println("Hello world !");
    }

    //2. Hàm không có tham số nhưng có return value (kiểu trả về khác void, VD: int, double, float, char,...)
    public static int currentYear() {
        LocalDate current_date = LocalDate.now();
        int current_year = current_date.getYear();
        return current_year;
    }

    //3. Hàm có tham số nhưng không return value
    public static void welcome(String name) {
        System.out.println("Welcome " + name + " to Greenwich Vietnam !");
    }

    //4. Hàm có tham số và có return value
    public static int total (int a, int b) {
//        int total = a + b;
//        return total;
        return a + b;
    }
}
