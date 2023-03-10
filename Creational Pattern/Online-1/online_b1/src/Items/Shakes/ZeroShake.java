package Items.Shakes;

public class ZeroShake extends Shake{
    private String ingredients = "";

    public ZeroShake(){
        super("Zero Shake", 240);
    }

    @Override
    public String getIngredients() {
        if (getIsLactoseFree()){
            ingredients += "Almond Milk, ";
        }
        else{
            ingredients += "Milk, ";
        }
        ingredients += "Chocolate Syrup, Chocolate Ice-cream";
        return ingredients;
    }
}
