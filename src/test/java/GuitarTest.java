import items.InstrumentType;
import items.instruments.Guitar;
import items.instruments.instrumentEnums.GuitarType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar acousticGuitar;

    @Before
    public void setUp(){
        acousticGuitar = new Guitar("Acoustic", 100, 150, InstrumentType.STRING, "Oak", "Brown", GuitarType.ACOUSTIC, 6);
    }

    @Test
    public void hasName(){
        assertEquals("Acoustic", acousticGuitar.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(100, acousticGuitar.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(150, acousticGuitar.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, acousticGuitar.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Oak", acousticGuitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", acousticGuitar.getColour());
    }

    @Test
    public void hasBagpipesType() {
        assertEquals(GuitarType.ACOUSTIC, acousticGuitar.getGuitarType());
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(6, acousticGuitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing: ping ping ping", acousticGuitar.play("ping ping ping"));
    }
}
