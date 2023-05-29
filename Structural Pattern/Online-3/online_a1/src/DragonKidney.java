public class DragonKidney extends PotionDecorator{
    public DragonKidney(Potion potion) {
        super(potion);
    }
    @Override
    public String getName() {
        return super.getName()+"Dragon Kidney\n";
    }

    @Override
    public double getPrice() {
        return 5.86 / 10;
    }

    @Override
    public int numberOfIngredients() {
        return super.numberOfIngredients()+1;
    }
}
