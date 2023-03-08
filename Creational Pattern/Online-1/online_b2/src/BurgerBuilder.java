public interface BurgerBuilder {
    void addBuns();
    void addPattys(int p);
    void addCheese(int c);
    void addSalad(int sl);
    void addBBQSauce(int bbq);
    Product getBurger();
}
