package Components.Additionals.GraphicsCard;

import Components.Additionals.Additional;

public abstract class GraphicsCard extends Additional {
    private double price;
    private String name;

    public GraphicsCard(String name, double price){
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
