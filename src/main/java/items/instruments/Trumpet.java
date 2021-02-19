package items.instruments;

import items.Instrument;
import items.InstrumentType;
import items.instruments.instrumentEnums.TrumpetType;

public class Trumpet extends Instrument {
    TrumpetType trumpetType;
    private int numberOfValves;

    public Trumpet(String name, double manufacturerPrice, double sellingPrice,
                   InstrumentType instrumentType, String material, String colour,
                   TrumpetType trumpetType, int numberOfValves) {
        super(name, manufacturerPrice, sellingPrice, instrumentType, material, colour);
        this.trumpetType = trumpetType;
        this.numberOfValves = numberOfValves;
    }

    public TrumpetType getTrumpetType() {
        return trumpetType;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
