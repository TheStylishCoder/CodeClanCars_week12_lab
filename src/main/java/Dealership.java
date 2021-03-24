import people.Customer;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public void addMoneyToTill(double amount){
        this.till += amount;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    
}
