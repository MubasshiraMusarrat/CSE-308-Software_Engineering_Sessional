public interface DWS {
    String getNID();
    void deposit(double money);
    double getCurrentBalance();
    double sendMoney(String NID2, double money);
    void receiveMoney(String NID2, double money);
}
