package Decorators;

import Beverage.Coffee;

public class Cinnamon_Powder extends CondimentDecorator{

    public Cinnamon_Powder(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Cinnamon Powder: 50 bdt\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }
}
