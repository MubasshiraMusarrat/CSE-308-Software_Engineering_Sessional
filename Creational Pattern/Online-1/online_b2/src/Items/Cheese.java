package Items;

public class Cheese implements Item{
    @Override
    public String getName() {
        return "Cheese";
    }

    @Override
    public double getPrice() {
        return 30;
    }
}
