package lab10;

import java.io.Serializable;

public class Mobile implements Serializable {
    private String name;
    private String brand;
    private int year;
    private double price;

    public Mobile(String name, String brand, int year, double price) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int Year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year+ '\'' +
                ", price=" + price +
                '}';
    }
}
