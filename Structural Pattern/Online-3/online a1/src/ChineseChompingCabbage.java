public class ChineseChompingCabbage extends PotionDecorator{
    public ChineseChompingCabbage(Potion potion) {
        super(potion);
    }
    @Override
    public String getName() {
        return super.getName()+"Chinese Chomping Cabbage\n";
    }

    @Override
    public double getPrice() {
        return 4.13 / 10;
    }

    @Override
    public int numberOfIngredients() {
        return super.numberOfIngredients()+1;
    }
}
