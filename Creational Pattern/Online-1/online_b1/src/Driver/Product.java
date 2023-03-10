package Driver;

import Items.Item;
import Items.Shakes.Shake;

import java.util.LinkedList;

public class Product {
    private double totalCost;
    private final LinkedList<Item> items;

    public Product() {
        this.totalCost = 0;
        this.items = new LinkedList<>();
    }

    public void add(Item c){
        items.add(c);
        totalCost += c.getPrice();
    }

    public double getTotalCost(){
        return totalCost;
    }

    public void showOrder(){
        int candy = 0;
        int cookie = 0;

        Shake shake = (Shake) items.get(0);
        System.out.println("Your shake: "+shake.getName());
        System.out.println("Ingredients: "+shake.getIngredients());
        System.out.println("Price : "+shake.getPrice()+" taka");
        if(shake.getIsLactoseFree()){
            System.out.println("Extra 60 taka for almond milk");
        }

        for(int i = 1 ; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase("Candy")) candy++;
            else if(items.get(i).getName().equalsIgnoreCase("Cookie")) cookie++;
            else
                System.out.println("Invalid item");
        }

        if(candy > 0){
            if(candy == 1)
                System.out.println("1 candy");
            else
                System.out.println(candy+" x candies");
            System.out.println("Extra 50 taka for each candy");
            System.out.println("Added "+(candy*50)+" taka");
        }

        if(cookie > 0){
            if(cookie == 1)
                System.out.println("1 cookie");
            else
                System.out.println(cookie+" x cookies");
            System.out.println("Extra 40 taka for each candy");
            System.out.println("Added "+(cookie*40)+" taka");
        }
        System.out.println("Total price: "+totalCost+" taka");
    }
}
