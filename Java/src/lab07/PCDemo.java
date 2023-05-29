package lab07;

public class PCDemo {
    public static void main(String[] args) {
        //Nếu khai báo abstract class thì không thể khởi tạo object
        //PC pc = new PC("Core i7", "16 GB", "1TB");  => ERROR
        Laptop laptop = new Laptop("Core i7", "16GB", "1TB", "5 hours");
        PC desktop = new Desktop("Core i9", "32 GB", "2TB", 3);

        System.out.println(laptop.toString());
        System.out.println(desktop.toString());
    }
}
