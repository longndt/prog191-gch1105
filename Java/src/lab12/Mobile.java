package lab12;

import java.io.Serializable;

public class Mobile implements Serializable {
    private String name;
    private String brand;
    private double price;
    private int year;

    public Mobile(String name, String brand, double price, int year) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.year = year;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
