package components.cooler;

import components.Components;

public abstract class Cooler implements Components {
    protected int price;
    protected String description;

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String getDescription(){
        return description;
    }
}
