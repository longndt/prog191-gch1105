package lab06;

//sub class (child)
public class Cat extends Animal {
    private String ownerName;

    public Cat(String name, int age, String color, String ownerName) {
        super(name, age, color);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
