package items.instruments;

import behaviours.IPlay;
import items.Instrument;
import items.InstrumentType;
import items.instruments.instrumentEnums.GuitarType;

public class Guitar extends Instrument implements IPlay {
    GuitarType guitarType;
    private int numberOfStrings;

    public Guitar(String name, double manufacturerPrice, double sellingPrice,
                  InstrumentType instrumentType, String material, String colour,
                  GuitarType guitarType, int numberOfStrings) {
        super(name, manufacturerPrice, sellingPrice, instrumentType, material, colour);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(String sound){
        return "Playing: " + sound;
    }
}
