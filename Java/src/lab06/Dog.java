package lab06;

//sub class (child)
public class Dog extends Animal {
    private String origin;

    public Dog(String name, int age, String color, String origin) {
        super(name, age, color);
        this.origin = origin;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Origin: " + origin);
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "origin='" + origin + '\'' +
                '}';
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
