package Decorators;

import Beverage.Coffee;

public class Chocolate_Sauce extends CondimentDecorator{

    public Chocolate_Sauce(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Chocolate Sauce: 60 bdt\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 60;
    }
}
