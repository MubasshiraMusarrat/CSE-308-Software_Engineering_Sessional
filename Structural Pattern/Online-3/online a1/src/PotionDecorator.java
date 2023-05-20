public abstract class PotionDecorator implements Potion{
    private Potion potion;

    public PotionDecorator(Potion potion){
        this.potion = potion;
    }

    @Override
    public String getName() {
        return potion.getName();
    }

    @Override
    public double getPrice() {
        return potion.getPrice();
    }

    @Override
    public int numberOfIngredients(){
        return potion.numberOfIngredients();
    }
}
