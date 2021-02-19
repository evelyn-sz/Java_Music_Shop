package items.instruments;

import behaviours.IPlay;
import items.Instrument;
import items.InstrumentType;
import items.instruments.instrumentEnums.PianoType;

public class Piano extends Instrument  implements IPlay {
    PianoType pianoType;
    private int numberOfKeys;

    public Piano(String name, double manufacturerPrice, double sellingPrice,
                 InstrumentType instrumentType, String material, String colour,
                 PianoType pianoType, int numberOfKeys) {
        super(name, manufacturerPrice, sellingPrice, instrumentType, material, colour);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(String sound){
        return "Playing: " + sound;
    }

}
