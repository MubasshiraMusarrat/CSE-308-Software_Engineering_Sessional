package Driver;

import Builders.ShakeBuilder;

public class Director {
    private ShakeBuilder shakeBuilder;

    public Director(ShakeBuilder shakeBuilder){
        this.shakeBuilder = shakeBuilder;
    }

    public void produceShake(boolean isLactoseFree, int candy, int cookie){
        shakeBuilder.addShake(isLactoseFree);
        for(int i = 1; i<=candy; i++) shakeBuilder.addCandy();
        for(int i = 1; i<=cookie; i++) shakeBuilder.addCookie();
    }

    public Product getShake(){
        return shakeBuilder.getProduct();
    }
}
