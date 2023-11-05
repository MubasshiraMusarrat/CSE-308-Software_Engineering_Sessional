public class Akash implements DWS{
    private String NID;
    private double balance;

    public Akash(String NID, double balance){
        this.NID = NID;
        this. balance = balance;
    }
    @Override
    public String getNID() {
        return NID;
    }

    @Override
    public void deposit(double money) {
        balance += money;
    }

    @Override
    public double getCurrentBalance() {
        return balance;
    }

    @Override
    public double sendMoney(String NID2, double money) {
        System.out.println( NID+": Sending "+money+" taka to akash account "+NID2);
        System.out.println("Current balance: "+balance+" taka");
        return money;
    }

    @Override
    public void receiveMoney(String NID2, double Money) {
        System.out.println(NID+" Received "+Money+" taka from akash account "+NID2);
        System.out.println("Current balance: "+balance+" taka");
        balance += Money;
    }
}
