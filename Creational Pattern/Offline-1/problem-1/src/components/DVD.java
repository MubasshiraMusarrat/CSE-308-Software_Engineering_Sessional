package components;

public class DVD implements Components{
    private int price;
    private String description;

    public DVD(){
        price = 6000;
        description = "DVD Drive";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
