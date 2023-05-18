package Driver;

import Items.Item;

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
        int patties = 0;
        int cheese = 0;
        int bbqSauce = 0;
        int salad = 0;

        Item item = items.get(0);
        System.out.println("Your ordered burger.");
        System.out.println("Base Ingredients: \n2 Buns");
        System.out.println("Price of each bun = 20 Tk");
        System.out.println("1 Patty");
        System.out.println("Price of 1 patty = 80 Tk");
        System.out.println("Price = 120 Tk");

        for(int i = 3 ; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase("Patty")) patties++;
            else if(items.get(i).getName().equalsIgnoreCase("Cheese")) cheese++;
            else if(items.get(i).getName().equalsIgnoreCase("BBQ Sauce")) bbqSauce++;
            else if(items.get(i).getName().equalsIgnoreCase("Salad")) salad++;
            else
                System.out.println("Invalid item");
        }

        if(patties > 0){
            System.out.println(patties+" x extra patties");
            System.out.println("Extra 80 taka for each patty");
            System.out.println("Added "+(patties*80)+" taka");
        }

        if(cheese > 0){
            System.out.println(cheese+" x cheese");
            System.out.println("Extra 30 taka for each cheese");
            System.out.println("Added "+(cheese*30)+" taka");
        }

        if(bbqSauce > 0){
            System.out.println(bbqSauce+" x bbq sauce");
            System.out.println("Extra 20 taka for each bbq sauce");
            System.out.println("Added "+(bbqSauce*20)+" taka");
        }

        if(salad > 0){
            System.out.println(salad+" x salad");
            System.out.println("Extra 10 taka for each salad");
            System.out.println("Added "+(salad*10)+" taka");
        }

        System.out.println("Total price: "+totalCost+" taka");
    }
}
