import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;

    @Before
    public void before(){
        customer = new Customer(10000);
        engine = new Engine("petrol");
        car = new Car(10000, "red", engine);
    }

    @Test
    public void hasMoney(){
        assertEquals(10000, customer.getMoney(), 0.01);
    }

    @Test
    public void vehicleListStartsEmpty(){
        assertEquals(0, customer.countVehicles());
    }

    @Test
    public void canAddVehicle(){
        customer.addVehicle(car);
        assertEquals(1, customer.countVehicles());
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(car.getPrice());
        assertEquals(0, customer.getMoney(), 0.01);
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(car);
        assertEquals(0, customer.getMoney(), 0.01);
        assertEquals(1, customer.countVehicles());
    }
}
