package DefinningClasses.Exercise.SpeedRacer_03;

public class Car {
    private String model;
    private  double fuelAmount;
    private double priceFuelPerKm;
    private int distanceTravel;


    public Car(String model, double fuelAmount, double priceFuelPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.priceFuelPerKm = priceFuelPerKm;
        this.distanceTravel = 0;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getPriceFuelPerKm() {
        return priceFuelPerKm;
    }

    public void setPriceFuelPerKm(double priceFuelPerKm) {
        this.priceFuelPerKm = priceFuelPerKm;
    }

    public int getDistanceTravel() {
        return distanceTravel;
    }

    public void setDistanceTravel(int distanceTravel) {
        this.distanceTravel = distanceTravel;
    }

    public  boolean drive (int kmDrive) {
        double needFuel = kmDrive * this.priceFuelPerKm;
        if (needFuel <= this.fuelAmount) {
            this.fuelAmount -= needFuel;
            this.distanceTravel += kmDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.distanceTravel);
    }
}
