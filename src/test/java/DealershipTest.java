import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;
import vehicles.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Vehicle vehicle;
    Engine engine;

    @Before
    public void before(){
        dealership = new Dealership(100000);
        customer = new Customer(10000);
        engine = new Engine("petrol");
        vehicle = new Car(10000, "red", engine);
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.stockCount());
    }
}
