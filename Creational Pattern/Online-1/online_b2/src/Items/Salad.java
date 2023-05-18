package Items;

public class Salad implements Item{
    @Override
    public String getName() {
        return "Salad";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
