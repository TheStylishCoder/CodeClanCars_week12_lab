import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("petrol");
        car = new Car(10000, "red", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("red", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canBuy(){
        Customer richCustomer = new Customer(10000);
        Customer poorCustomer = new Customer(100);
        assertEquals(true, car.canBuy(richCustomer));
        assertEquals(false, car.canBuy(poorCustomer));
    }

    @Test
    public void canDiscountPriceForDamage(){
        car.addDamage(1500);
        assertEquals(8500, car.getPrice(), 0.01);
    }
}
