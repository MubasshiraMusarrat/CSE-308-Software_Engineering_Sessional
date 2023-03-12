public interface State {
    String stateName();
    void insertMoney(Money money);
    void collectProduct();
    void dispense();
    void collectChange();
}
