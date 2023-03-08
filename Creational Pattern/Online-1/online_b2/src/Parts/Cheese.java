package Parts;

public class Cheese implements Parts{
    private int quantity;
    private double price = 30.0;
    private String name = "Cheese";

    public Cheese(int quantity){
        this.quantity=quantity;
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
