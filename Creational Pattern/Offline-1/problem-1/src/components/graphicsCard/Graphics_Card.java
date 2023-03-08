package components.graphicsCard;

import components.Components;

public abstract class Graphics_Card implements Components {
    protected int price;
    protected String description;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
