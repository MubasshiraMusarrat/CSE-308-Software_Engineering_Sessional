package Parts;

public class Bun implements Parts{
    private int quantity =2;
    private double price = 20.0;
    private String name = "Bun";
    @Override
    public int Quantity() {
        return quantity;
    }

    @Override
    public double Price() {
        return price;
    }

    @Override
    public String description() {
        return name;
    }
}
