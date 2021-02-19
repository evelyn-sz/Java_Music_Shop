import items.InstrumentType;
import items.instruments.Piano;
import items.instruments.instrumentEnums.PianoType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PianoTest {
    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Fortepiano", 900, 1300, InstrumentType.STRING, "Birch", "Yellow", PianoType.CONCERTGRAND, 124);
    }

    @Test
    public void hasName(){
        assertEquals("Fortepiano", piano.getName());
    }

    @Test
    public void hasManufacturerPrice() {
        assertEquals(900, piano.getManufacturerPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1300, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, piano.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Birch", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Yellow", piano.getColour());
    }

    @Test
    public void hasBagpipesType() {
        assertEquals(PianoType.CONCERTGRAND, piano.getPianoType());
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(124, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing: click click click", piano.play("click click click"));
    }

}
