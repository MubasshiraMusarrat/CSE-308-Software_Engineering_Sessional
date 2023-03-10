package Builders;

import Items.Shakes.ChocolateShake;
import Items.Shakes.Shake;

public class ChocolateShakeBuilder extends ShakeBuilder{
    @Override
    public void addShake(boolean isLactoseFree) {
        Shake chocolateShake = new ChocolateShake();
        chocolateShake.isLactoseFree(isLactoseFree);
        getProduct().add(chocolateShake);
    }
}
