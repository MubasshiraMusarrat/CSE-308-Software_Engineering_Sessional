package Items;

public class Patty implements Item{
    @Override
    public String getName() {
        return "Patty";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
