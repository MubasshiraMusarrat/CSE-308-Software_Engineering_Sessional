package Items.Shakes;

import Items.Item;

public class Shake implements Item {
    private String name;
    private double price = 0;
    private boolean lactoseFree = false;
    private String ingredients = "";

    public Shake(String name, double price){
        this.name = name;
        this. price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    public void isLactoseFree(boolean val){
        lactoseFree = val;
    }

    public boolean getIsLactoseFree(){
        return lactoseFree;
    }

    public String getIngredients(){
        if (lactoseFree){
            ingredients += "Almond Milk, ";
        }
        else{
            ingredients += "Milk, ";
        }
        ingredients += "Sugar, Chocolate Syrup, Chocolate Ice-cream";
        return ingredients;
    }
    @Override
    public double getPrice(){
        if(lactoseFree){
            price += 60;
        }
        return price;
    }
}
