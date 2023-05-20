package Decorators;

import Beverage.Coffee;

public class Dairy_Cream extends CondimentDecorator{

    public Dairy_Cream(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Dairy Cream: 40 bdt\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }
}
