package Builders;

import Items.Shakes.ChocolateShake;
import Items.Shakes.CoffeeShake;
import Items.Shakes.Shake;

public class CoffeeShakeBuilder extends ShakeBuilder{
    @Override
    public void addShake(boolean isLactoseFree) {
        Shake coffeeShake = new CoffeeShake();
        coffeeShake.isLactoseFree(isLactoseFree);
        getProduct().add(coffeeShake);
    }
}
