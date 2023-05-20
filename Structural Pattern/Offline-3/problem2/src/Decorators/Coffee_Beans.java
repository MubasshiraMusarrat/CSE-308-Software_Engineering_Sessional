package Decorators;

import Beverage.Coffee;

public class Coffee_Beans extends CondimentDecorator{

    public Coffee_Beans(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Extra Coffee Beans: 30 bdt\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30;
    }
}
