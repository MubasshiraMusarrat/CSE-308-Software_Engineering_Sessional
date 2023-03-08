package components;

//base components every pc hold
public class Core implements Components{
    private String CPU = "CPU";
    private String motherBoard = "Motherboard";
    private String HDD = "1TB HDD";
    private int price = 70000;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return CPU+","+motherBoard+","+HDD;
    }
}
