package exercise.oop;

public class Car {
    private double fuel_efficiency;
    private double fuel_amount;

    //    The efficiency is specified in the constructor,
//    and the initial fuel level is 0
    public Car (double efficiency) {
        this.fuel_efficiency = efficiency;
        this.fuel_amount = 0;
    }
    public void drive (double distance) {
        fuel_amount -=  distance/fuel_efficiency ;
    }
    public void addGas (double amount) {
        fuel_amount += amount;
    }

    public double getGasInTank ()
    {
        return fuel_amount;
    }
}
