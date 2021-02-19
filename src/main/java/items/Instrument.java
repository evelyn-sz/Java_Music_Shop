package items;

public abstract class Instrument extends Item {
    InstrumentType instrumentType;
    private String material;
    private String colour;

    public Instrument(String name, double manufacturerPrice,
                      double sellingPrice, InstrumentType instrumentType,
                      String material, String colour) {
        super(name, manufacturerPrice, sellingPrice);
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
}
