import items.InstrumentType;
import items.accessories.Accessory;
import items.instruments.*;
import items.instruments.instrumentEnums.*;
import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    Accessory drumsticks;
    Accessory musicNotes;
    Bagpipes bagpipes;
    Drum drum;
    Guitar acousticGuitar;
    Trumpet cornet;
    Piano piano;

    @Before
    public void setUp(){
        shop = new MusicShop("Varsity Music");
        drumsticks = new Accessory("Drum Sticks", 5.00, 9.00);
        musicNotes = new Accessory("J S Bach", 3, 4);
        bagpipes = new Bagpipes("Edinburger", 120.00, 200, InstrumentType.WOODWING, "Cloth", "Tartan", BagpipeType.SCOTTISH);
        drum = new Drum("Drum", 400, 500, InstrumentType.PERCUSSION, "Metal", "Shiny", DrumType.TUNED, 12);
        acousticGuitar = new Guitar("Acoustic", 100, 150, InstrumentType.STRING, "Oak", "Brown", GuitarType.ACOUSTIC, 6);
        cornet = new Trumpet("Elephant", 180, 260, InstrumentType.BRASS, "Brass", "Gold", TrumpetType.CORNET, 18);
        piano = new Piano("Fortepiano", 900, 1300, InstrumentType.STRING, "Birch", "Yellow", PianoType.CONCERTGRAND, 124);

    }

    @Test
    public void hasName(){
        assertEquals("Varsity Music", shop.getName());
    }

    @Test
    public void canAddInstrumentToCollection(){
        shop.addToInstrumentCollection(drum);
        shop.addToInstrumentCollection(piano);
        assertEquals(2, shop.getNumberOfInstruments());
    }

    @Test
    public void canAddAccessoryToCollection() {
        shop.addToAccessoryCollection(drumsticks);
        shop.addToAccessoryCollection(musicNotes);
        assertEquals(2, shop.getNumberOfAccessories());
    }
}
