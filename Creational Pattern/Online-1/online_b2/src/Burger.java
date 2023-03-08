import Parts.*;

public class Burger implements BurgerBuilder {
    private final Product burger;

    public Burger() {
        burger = new Product();
    }

    @Override
    public void addBuns() {
        burger.add(new Bun());
    }

    @Override
    public void addPattys(int p) {

        burger.add(new Patty(p));
    }

    @Override
    public void addCheese(int c) {
        burger.add(new Cheese(c));
    }

    @Override
    public void addSalad(int sl) {
        burger.add(new Salad(sl));
    }

    @Override
    public void addBBQSauce(int bbq) {
        burger.add(new BBQSauce(bbq));
    }

    @Override
    public Product getBurger() {
        return burger;
    }
}
