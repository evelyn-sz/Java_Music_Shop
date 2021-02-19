package items.instruments;

import behaviours.IPlay;
import behaviours.ISell;
import items.Instrument;
import items.InstrumentType;
import items.instruments.instrumentEnums.BagpipeType;

public class Bagpipes extends Instrument implements IPlay {
    BagpipeType bagpipeType;

    public Bagpipes(String name, double manufacturerPrice, double sellingPrice,
                    InstrumentType instrumentType, String material, String colour,
                    BagpipeType bagpipeType) {
        super(name, manufacturerPrice, sellingPrice, instrumentType, material, colour);
        this.bagpipeType = bagpipeType;
    }

    public BagpipeType getBagpipeType() {
        return bagpipeType;
    }

    public String play(String sound){
        return "Playing: " + sound;
    }

}
