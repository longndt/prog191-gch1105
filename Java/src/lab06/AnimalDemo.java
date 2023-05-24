package lab06;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal("Milu", 3, "Black");
        Dog d1 = new Dog("Fox", 2, "White", "Vietnam");
        Cat c1 = new Cat("Miu", 5, "Brown", "Hung Lam");

        System.out.println(a1.toString());
        d1.showInfo();
        System.out.println(d1.toString());
        c1.showInfo();
        System.out.println(c1.toString());
    }
}
