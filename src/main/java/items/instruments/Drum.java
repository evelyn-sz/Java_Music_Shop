package items.instruments;

import behaviours.IPlay;
import items.Instrument;
import items.InstrumentType;
import items.instruments.instrumentEnums.DrumType;

public class Drum extends Instrument implements IPlay {
    DrumType drumType;
    private int numberOfDrums;

    public Drum(String name, double manufacturerPrice, double sellingPrice,
                InstrumentType instrumentType, String material, String colour,
                DrumType drumType, int numberOfDrums) {
        super(name, manufacturerPrice, sellingPrice, instrumentType, material, colour);
        this.drumType = drumType;
        this.numberOfDrums = numberOfDrums;
    }

    public DrumType getDrumType() {
        return drumType;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public String play(String sound){
        return "Playing: " + sound;
    }
}
