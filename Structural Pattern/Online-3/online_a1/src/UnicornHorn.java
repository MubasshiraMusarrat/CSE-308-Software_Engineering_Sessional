public class UnicornHorn extends PotionDecorator {
    public UnicornHorn(Potion potion) {
        super(potion);
    }

    @Override
    public String getName() {
        return super.getName() + "Unicorn Horn\n";
    }

    @Override
    public double getPrice() {
        return 6.31 / 10;
    }

    @Override
    public int numberOfIngredients() {
        return super.numberOfIngredients()+1;
    }
}
