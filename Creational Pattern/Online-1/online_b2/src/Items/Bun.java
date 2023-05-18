package Items;

public class Bun implements Item{
    @Override
    public String getName() {
        return "Bun";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
