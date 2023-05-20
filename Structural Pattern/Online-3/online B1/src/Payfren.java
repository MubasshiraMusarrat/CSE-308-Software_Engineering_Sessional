public class Payfren {
    private String SSN;
    private double balance;

    public Payfren(String SSN, double balance){
        this.SSN = SSN;
        this. balance = balance;
    }

    public String getSSN(){
        return SSN;
    }

    public void deposit(double money) {
        balance += money;
    }

    public double getCurrentBalance() {
        return balance;
    }

    public double sendMoney(String SSN2, double money) {
        System.out.println(SSN+": Sending "+money+" dollar to payfren account "+SSN2);
        System.out.println("Current balance: "+balance+" dollar");
        return money;
    }

    public void receiveMoney(String SSN2, double Money) {
        System.out.println(SSN2+" Received "+Money+" dollar from payfren account "+SSN2);
        System.out.println("Current balance: "+balance+" dollar");
        balance += Money;
    }
}
