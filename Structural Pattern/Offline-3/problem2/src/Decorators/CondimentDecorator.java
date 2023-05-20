package Decorators;

import Beverage.Coffee;

public abstract class CondimentDecorator implements Coffee{
    private Coffee coffee;

    public CondimentDecorator( Coffee c){
        this.coffee = c;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}
