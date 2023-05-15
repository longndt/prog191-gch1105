package lab03;

public class Laptop {
    private String brand;
    private String model;
    private double price;
    private String color;

    //constructor: empty + full
    //Note: tên của constructor trùng với tên của class
    public Laptop() {
    }

    public Laptop(String b, String m, double p, String c) {
        brand = b;
        model = m;
        price = p;
        color = c;
    }

    //getter
    //Note: return type của getter sẽ trùng với data type của attribute
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    //setter
    //Note: return type của setter luôn luôn là void
    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //displayInfo()
    public void displayInfo() {
        System.out.println("Laptop brand: " + brand);
        System.out.println("Laptop model: " + model);
        System.out.println("Laptop price: " + price + "$");
        System.out.println("Laptop color: " + color);
    }
}
