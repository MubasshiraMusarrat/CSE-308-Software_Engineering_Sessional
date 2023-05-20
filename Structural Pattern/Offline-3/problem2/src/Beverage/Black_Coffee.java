package Beverage;

public class Black_Coffee implements Coffee{
    @Override
    public String getDescription() {
        return "Mug: 100 bdt\nWater\nGrinded Coffee Beans: 30 bdt\n";
    }

    @Override
    public double getPrice() {
        return (100+30);
    }
}
