package Parts;

public class BBQSauce implements Parts{
    private int quantity;
    private double price = 20.0;
    private String name = "BBQ Sauce";

    public BBQSauce(int quantity){
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
