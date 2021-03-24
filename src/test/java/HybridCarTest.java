import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        hybridCar = new HybridCar(15000, "red", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(15000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("red", hybridCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void canBuy(){
        Customer richCustomer = new Customer(15000);
        Customer poorCustomer = new Customer(100);
        assertEquals(true, hybridCar.canBuy(richCustomer));
        assertEquals(false, hybridCar.canBuy(poorCustomer));
    }

    @Test
    public void canDiscountPriceForDamage(){
        hybridCar.addDamage(1000);
        assertEquals(14000, hybridCar.getPrice(), 0.01);
    }
}
