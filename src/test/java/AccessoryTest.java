import items.accessories.Accessory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory drumsticks;

    @Before
    public void setUp(){
        drumsticks = new Accessory("Drum Sticks", 5.00, 9.00);
    }

    @Test
    public void hasName() {
        assertEquals("Drum Sticks", drumsticks.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(5.00, drumsticks.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(9.00, drumsticks.getSellingPrice(), 0.0);
    }
}
