package Parts;

public class Salad implements Parts{
    private int quantity;
    private double price = 10.0;
    private String name = "Salad";

    public Salad(int quantity){
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
