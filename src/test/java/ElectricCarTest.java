import components.Engine;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric");
        electricCar = new ElectricCar(20000, "red", engine);
    }

    @Test
    public void hasPrice(){
        assertEquals(20000, electricCar.getPrice(),0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("red", electricCar.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void canBuy(){
        Customer richCustomer = new Customer(30000);
        Customer poorCustomer = new Customer(100);
        assertEquals(true, electricCar.canBuy(richCustomer));
        assertEquals(false, electricCar.canBuy(poorCustomer));
    }

    @Test
    public void canDiscountPriceForDamage(){
        electricCar.addDamage(5000);
        assertEquals(15000, electricCar.getPrice(), 0.01);
    }
}
