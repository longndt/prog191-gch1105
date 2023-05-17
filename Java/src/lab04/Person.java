package lab04;

public class Person {
    private static String name = "Tuan";             // non-static attribute (variable)
    private static int birthYear = 2000;      // static attribute (variable)

    public static void main(String[] args) {
        /* muốn truy xuất hoặc gọi đến class attribute
        trong các static method của class thì cần phải
        khai báo từ khóa "static". nếu gọi đến class
        attribute đấy trong các non-static method thì
        không cần khai báo "static" cho attribute
         */

        System.out.println(name);
        System.out.println(birthYear);

        /* muốn gọi đến 1 method trong hàm main (static method)
        thì phải khai báo "static" cho method đấy
         */
        showInfo();
    }

    public static void showInfo () {
        System.out.println("Name: " + name);
        System.out.println("Birth year: " + birthYear);
    }
}
