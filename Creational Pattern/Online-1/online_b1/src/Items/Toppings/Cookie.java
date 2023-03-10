package Items.Toppings;

public class Cookie extends Topping{
    @Override
    public String getName() {
        return "Cookie";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
