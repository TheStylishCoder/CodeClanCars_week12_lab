import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;


import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Customer customer;
    Car car;
    Engine engine;

    @Before
    public void before(){
        dealership = new Dealership(100000);
        customer = new Customer(10000);
        engine = new Engine("petrol");
        car = new Car(10000, "red", engine);
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(car);
        assertEquals(1, dealership.stockCount());
    }

    @Test
    public void canAddMoneyToTill(){
        dealership.addMoneyToTill(100.00);
        assertEquals(100100.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canSellCarToCustomer(){
        dealership.sellVehicleToCustomer(car, customer);
        assertEquals(110000, dealership.getTill(), 0.01);
    }


}
