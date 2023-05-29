public class MakersSolution implements Potion{
    @Override
    public String getName() {
        String s = "White Spirit\nCastor Oil\n";
        return s;
    }

    @Override
    public double getPrice() {
        return (1.23/10)+ (2.47/10);
    }

    @Override
    public int numberOfIngredients() {
        return 2;
    }
}
