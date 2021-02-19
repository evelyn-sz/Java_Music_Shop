package shop;

import items.Instrument;
import items.accessories.Accessory;
import items.instruments.Drum;

import java.util.ArrayList;

public class MusicShop {
    private String name;
    private ArrayList<Instrument> instrumentCollection;
    private ArrayList<Accessory> accessoryCollection;
    private double markup;

    public MusicShop(String name) {
        this.name = name;
        this.instrumentCollection = new ArrayList<>();
        this.accessoryCollection = new ArrayList<>();
        this.markup = 0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Instrument> getInstrumentCollection() {
        return instrumentCollection;
    }

    public ArrayList<Accessory> getAccessoryCollection() {
        return accessoryCollection;
    }

    public double getMarkup() {
        return markup;
    }


    public void addToInstrumentCollection(Instrument instrument) {
        this.instrumentCollection.add(instrument);
    }

    public int getNumberOfInstruments() {
        return this.instrumentCollection.size();
    }

    public void addToAccessoryCollection(Accessory accessory) {
        this.accessoryCollection.add(accessory);
    }

    public int getNumberOfAccessories() {
        return this.accessoryCollection.size();
    }

}
