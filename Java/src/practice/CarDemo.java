package practice;

public class CarDemo {
    public static void main(String[] args) {
        Car myHybrid = new Car(50); // efficiency of 50 miles per gallon
        System.out.println("Fuel efficiency: 50 miles/gallon");
        myHybrid.addGas(20); // Tank 20 gallons
        System.out.println("Car tank: 20 gallons");
        myHybrid.drive(100); // Drive 100 miles
        System.out.println("Travelled distance: 100 miles");
        double gasLeft = myHybrid.getGasInTank();
        System.out.println("Remained gas: " + gasLeft + " gallons");
    }
}
