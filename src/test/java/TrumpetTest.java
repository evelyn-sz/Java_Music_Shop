import items.InstrumentType;
import items.instruments.Trumpet;
import items.instruments.instrumentEnums.TrumpetType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TrumpetTest {
    Trumpet cornet;

    @Before
    public void setUp(){
        cornet = new Trumpet("Elephant", 180, 260, InstrumentType.BRASS, "Brass", "Gold", TrumpetType.CORNET, 18);
    }

    @Test
    public void hasName(){
        assertEquals("Elephant", cornet.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(180, cornet.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(260, cornet.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, cornet.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", cornet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", cornet.getColour());
    }

    @Test
    public void hasBagpipesType() {
        assertEquals(TrumpetType.CORNET, cornet.getTrumpetType());
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(18, cornet.getNumberOfValves());
    }

}
