package people;

import vehicles.Car;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }


    public int countVehicles() {
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeMoney(double price) {
        this.money -= price;
    }

    public void buyVehicle(Car car) {
        this.addVehicle(car);
        this.removeMoney(car.getPrice());
    }
}
