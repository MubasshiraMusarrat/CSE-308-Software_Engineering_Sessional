package Builder;

import Driver.Product;
import Items.*;

public class BurgerBuilder {
    private final Product burger;

    public BurgerBuilder() {
        burger = new Product();
    }

    public void addBuns(){
        for(int i=0;i<2;i++)
            burger.add(new Bun());
    }
    public void addPatty(){
        burger.add(new Patty());
    }
    public void addCheese(){
        burger.add(new Cheese());
    }

    public void addBBQSauce(){
        burger.add(new BBQSauce());
    }

    public void addSalad(){
        burger.add(new Salad());
    }
    public Product getBurger(){
        return burger;
    }
}
