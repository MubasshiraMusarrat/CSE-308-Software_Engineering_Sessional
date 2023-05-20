package Beverage;

public class Milk_Coffee implements Coffee{
    @Override
    public String getDescription() {
        return "Mug: 100 bdt\nMilk: 50 bdt\nGrinded Coffee Beans: 30 bdt\n";
    }

    @Override
    public double getPrice() {
        return (100+50+30);
    }
}
