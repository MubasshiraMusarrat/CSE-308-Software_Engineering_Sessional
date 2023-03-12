package Components.Additionals.RAM;

import Components.Additionals.Additional;

public abstract class RAM extends Additional {
    private double price;
    private String name;

    public RAM(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
