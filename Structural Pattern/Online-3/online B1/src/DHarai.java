public class DHarai {
    private String kojinBango;
    private double balance;

    public DHarai(String kb, double balance){
        this.kojinBango = kb;
        this. balance = balance;
    }

    public String getKojinBango(){
        return kojinBango;
    }

    public void deposit(double money) {
        balance += money;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public double sendMoney(String kb2, double money) {
        System.out.println(kb2+": Sending "+money+" yen to Dharai account "+kb2);
        System.out.println("Current balance: "+balance+" yen");
        return money;
    }

    public void receiveMoney(String kb2, double Money) {
        System.out.println("Kojin bango "+ kb2+" Received "+Money+" yen from DHarai account "+kb2);
        System.out.println("Current balance: "+balance+" yen");
        balance += Money;
    }
}
