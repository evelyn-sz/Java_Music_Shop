import items.InstrumentType;
import items.instruments.Drum;
import items.instruments.instrumentEnums.DrumType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp(){
        drum = new Drum("Drum", 400, 500, InstrumentType.PERCUSSION, "Metal", "Shiny", DrumType.TUNED, 12);
    }

    @Test
    public void hasName(){
        assertEquals("Drum", drum.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(400, drum.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500, drum.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Metal", drum.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Shiny", drum.getColour());
    }

    @Test
    public void hasBagpipesType() {
        assertEquals(DrumType.TUNED, drum.getDrumType());
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(12, drum.getNumberOfDrums());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing: bang bang bang", drum.play("bang bang bang"));
    }


}
