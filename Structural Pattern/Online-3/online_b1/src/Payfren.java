public class Payfren implements DWS {
    private int SSN;
    private double balance;

    public Payfren(int SSN, double balance) {
        this.SSN = SSN;
        this.balance = balance;
    }
    @Override
    public String name(){
        return "PayFren";
    }
    @Override
    public int getID() {
        return SSN;
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
    public void sendMoney(DWS dws, double money) {
        String id;
        if(dws.name().equalsIgnoreCase("akash")){
            id = "NID";
        }
        else if(dws.name().equalsIgnoreCase("D-Harai")){
            id = "KB";
        }
        else{
            id = "SSN";
        }
        if(balance<money){
            System.out.println("SSN"+SSN+": Insufficient balance to send "+money+" dollars to "+dws.name()+" account ( "+id+dws.getID()+")");
        }
        else {
            balance -= money;
            System.out.print("SSN" + SSN + ": Sending " + money + " dollars to " + dws.name() + " account ( " + id + dws.getID() + ")");
            System.out.println("...Current balance " + balance + " dollars...");
        }
    }

    @Override
    public void receiveMoney(DWS dws, double money) {
        String currency;
        String id;
        double bl;
        if(dws.name().equalsIgnoreCase("akash")){
            currency = " taka";
            id = "NID";
            bl = money * 0.01;

        }
        else if(dws.name().equalsIgnoreCase("D-Harai")){
            currency = " yen";
            id = "KB";
            bl = money * 0.005;
        }
        else{
            currency = " dollars";
            id = "SSN";
            bl = money;
        }
        balance += bl;
        System.out.print("SSN"+SSN+": Received " +money+currency+" from "+dws.name()+" account ("+id+dws.getID()+")");
        System.out.println("! Current balance "+balance+" dollars...");
    }

}