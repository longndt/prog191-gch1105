package lab03;

public class MotorbikeOwnerDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Tuan", 30);
        Person p2 = new Person("Khang", 35);

        Motorbike m1 = new Motorbike("Honda SH", "Black", p1);
        Motorbike m2 = new Motorbike("Yamaha Nouvo", "Grey", p2);
        Motorbike m3 = new Motorbike("Vinfast Klara", "White", p1);

        m1.showInfo();
        m2.showInfo();
        m3.showInfo();
    }
}
