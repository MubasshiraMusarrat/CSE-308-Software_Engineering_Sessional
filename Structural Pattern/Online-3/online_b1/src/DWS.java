public interface DWS {
    String name();
    int getID();
    void deposit(double money);
    double getCurrentBalance();
    void sendMoney(DWS dws, double money);
    void receiveMoney(DWS dws, double money);
}
