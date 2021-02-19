import items.InstrumentType;
import items.instruments.Bagpipes;
import items.instruments.instrumentEnums.BagpipeType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BagpipeTest {

    Bagpipes bagpipes;
    Bagpipes bagpipes2;

    @Before
    public void setUp(){
        bagpipes = new Bagpipes("Edinburger", 120.00, 200, InstrumentType.WOODWING, "Cloth", "Tartan", BagpipeType.SCOTTISH);
        bagpipes2 = new Bagpipes("Whistle Blower", 90, 140, InstrumentType.WOODWING, "Textiles", "Black", BagpipeType.NONSCOTTISH);
    }

    @Test
    public void hasName(){
        assertEquals("Edinburger", bagpipes.getName());
        assertEquals("Whistle Blower", bagpipes2.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(120.00, bagpipes.getManufacturerPrice(), 0.0);
        assertEquals(90.00, bagpipes2.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(200, bagpipes.getSellingPrice(), 0.0);
        assertEquals(140, bagpipes2.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWING, bagpipes.getInstrumentType());
        assertEquals(InstrumentType.WOODWING, bagpipes2.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Cloth", bagpipes.getMaterial());
        assertEquals("Textiles", bagpipes2.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Tartan", bagpipes.getColour());
        assertEquals("Black", bagpipes2.getColour());
    }

    @Test
    public void hasBagpipesType() {
        assertEquals(BagpipeType.SCOTTISH, bagpipes.getBagpipeType());
        assertEquals(BagpipeType.NONSCOTTISH, bagpipes2.getBagpipeType());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: wee wee wee", bagpipes.play("wee wee wee"));
    }
}
