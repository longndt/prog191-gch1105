package lab03;

public class Mobile {
    private String model;
    private double price;
    private String color;
    private boolean best_seller;

    //ALT + INSERT : Code Generation (for OOP class)

    public Mobile(String model, double price, String color, boolean best_seller) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.best_seller = best_seller;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBest_seller() {
        return best_seller;
    }

    public void setBest_seller(boolean best_seller) {
        this.best_seller = best_seller;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", best_seller=" + best_seller +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile mobile)) return false;

        if (Double.compare(mobile.getPrice(), getPrice()) != 0) return false;
        if (isBest_seller() != mobile.isBest_seller()) return false;
        if (getModel() != null ? !getModel().equals(mobile.getModel()) : mobile.getModel() != null) return false;
        return getColor() != null ? getColor().equals(mobile.getColor()) : mobile.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getModel() != null ? getModel().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        result = 31 * result + (isBest_seller() ? 1 : 0);
        return result;
    }
}
