package lab03;

public class Motorbike {
    private String model;
    private String color;
    private Person person;

    public Motorbike (String model, String color, Person person) {
        this.model = model;
        this.color = color;
        this.person = person;
    }
    public Motorbike (String color, Person person) {
        model = "Honda SH";
        this.color = color;
        this.person = person;
    }

    public void showInfo() {
        System.out.println("Motorbike model: " + model);
        System.out.println("Motorbike color: " + color);
        System.out.println("Motorbike owner: " + person.getName());
        System.out.println();
    }
}
