package Items;

public class BBQSauce implements Item{
    @Override
    public String getName() {
        return "BBQ Sauce";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
