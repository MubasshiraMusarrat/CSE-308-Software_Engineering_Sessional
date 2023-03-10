package Builders;

import Items.Shakes.ChocolateShake;
import Items.Shakes.Shake;
import Items.Shakes.ZeroShake;

public class ZeroShakeBuilder extends ShakeBuilder{
    @Override
    public void addShake(boolean isLactoseFree) {
        Shake zeroShake = new ZeroShake();
        zeroShake.isLactoseFree(isLactoseFree);
        getProduct().add(zeroShake);
    }
}
