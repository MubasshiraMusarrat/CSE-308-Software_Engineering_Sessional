public class DWSAdapter{
    private DWS dws;
    public DWSAdapter(DWS dws){
        this.dws = dws;
    }

    public DWS getDWS(){
        return dws;
    }
    public int getID() {
       return dws.getID();
    }
    public void deposit(double money) {
       dws.deposit(money);
    }

    public double getCurrentBalance() {
      return dws.getCurrentBalance();
    }

    public void sendMoney(Akash a, double money) {
        dws.sendMoney(a, money);
    }

    public void receiveMoney(Akash a, double money) {
        dws.receiveMoney(a, money);
    }
}
