public class Director {
    private BurgerBuilder burgerBuilder ;

    public void make(BurgerBuilder burger, int p, int c, int sl, int bbq){
        this.burgerBuilder = burger;
        burgerBuilder.addBuns();
        burgerBuilder.addPattys(p);
        burgerBuilder.addCheese(c);
        burgerBuilder.addSalad(sl);
        burgerBuilder.addBBQSauce(bbq);
    }
}
