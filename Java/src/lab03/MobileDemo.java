package lab03;

public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("iPhone 13 Pro Max", 1299.99, "Black", true);
        Mobile m2 =  new Mobile ("iPhone 13 Pro Max", 1299.99, "Black", true);
        Mobile m3 =  new Mobile ("iPhone 14", 1299.99, "Black", true);
        System.out.println(m1.toString());
        System.out.println("Mobile m1 is similar to Mobile m2: " + m1.equals(m2));
        System.out.println("Mobile m1 is similar to Mobile m3: " + m1.equals(m3));
    }
}
