package Builders;

import Driver.Product;
import Items.Toppings.Candy;
import Items.Toppings.Cookie;

public abstract class ShakeBuilder {
    private final Product shake;

    public ShakeBuilder(){
        shake = new Product();
    }
    public abstract void addShake(boolean isLactoseFree);

    public void addCandy(){
        shake.add(new Candy());
    }

    public void addCookie(){
        shake.add(new Cookie());
    }

    public Product getProduct(){
        return shake;
    }
}
