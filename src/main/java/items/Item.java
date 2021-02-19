package items;

public abstract class Item {
    private String name;
    private double manufacturerPrice;
    private double sellingPrice;

    public Item(String name, double manufacturerPrice, double sellingPrice) {
        this.name = name;
        this.manufacturerPrice = manufacturerPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public double getManufacturerPrice() {
        return manufacturerPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
