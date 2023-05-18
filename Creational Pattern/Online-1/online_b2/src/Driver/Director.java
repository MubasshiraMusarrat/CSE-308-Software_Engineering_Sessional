package Driver;

import Builder.BurgerBuilder;

public class Director {
    private BurgerBuilder burgerBuilder;

    public Director( BurgerBuilder burgerBuilder){
        this.burgerBuilder = burgerBuilder;
    }

    public void makeBurger(int patties, int cheese,int bbqSauce, int salad){
        burgerBuilder.addBuns();
        for(int i=0;i<patties;i++) burgerBuilder.addPatty();
        for(int i=0;i<cheese;i++) burgerBuilder.addCheese();
        for(int i=0;i<bbqSauce;i++) burgerBuilder.addBBQSauce();
        for(int i=0;i<salad;i++) burgerBuilder.addSalad();
    }
    public Product getBurger(){
        return burgerBuilder.getBurger();
    }
}
