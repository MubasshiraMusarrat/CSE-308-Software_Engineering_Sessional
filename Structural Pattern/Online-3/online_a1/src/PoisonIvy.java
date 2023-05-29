public class PoisonIvy extends PotionDecorator{
    public PoisonIvy(Potion potion) {
        super(potion);
    }

    @Override
    public String getName() {
        return super.getName()+"Poison Ivy\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3.38/10;
    }

    @Override
    public int numberOfIngredients() {
        return super.numberOfIngredients()+1;
    }
}
