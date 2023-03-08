package Parts;

public class Patty implements Parts{
    private int quantity = 1;
    private double price = 80.0;
    private String name = "Patty";

    public Patty(int quantity){
        this.quantity+=quantity;
    }

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
