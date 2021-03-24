package vehicles;

import behaviours.IBuy;
import components.Engine;
import people.Customer;

public abstract class Vehicle implements IBuy {

    private double price;
    private String colour;
    private Engine engine;

    // Constructor
    public Vehicle(double price, String colour, Engine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    // Methods
    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean canBuy(Customer customer){
        return customer.getMoney() >= this.price;
    }

    public void addDamage(double discount){
        this.price -= discount;
    }
}
