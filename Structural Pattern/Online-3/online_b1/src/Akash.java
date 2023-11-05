public class Akash implements DWS{
    private int NID;
    private double balance;

    public Akash(int NID, double balance){
        this.NID = NID;
        this. balance = balance;
    }
    @Override
    public String name(){
        return "akash";
    }
    @Override
    public int getID() {
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
    public void sendMoney(DWS dws, double money) {
        String id;
        if(dws.name().equalsIgnoreCase("PayFren")){
            id = "SSN";
        }
        else if(dws.name().equalsIgnoreCase("D-Harai")){
            id = "KB";
        }
        else{
            id = "NID";
        }
        if(balance<money){
            System.out.println("NID"+NID+": Insufficient balance to send "+money+" taka to "+dws.name()+" account ( "+id+dws.getID()+")");
        }
        else {
            balance -= money;
            System.out.print("NID" + NID + ": Sending " + money + " taka to " + dws.name() + " account ( " + id + dws.getID() + ")");
            System.out.println("...Current balance " + balance + " taka...");
        }
    }

    @Override
    public void receiveMoney(DWS dws, double money) {
        String currency;
        String id;
        double bl;
        if(dws.name().equalsIgnoreCase("PayFren")){
            currency = " dollars";
            id = "SSN";
            bl = money * 100;
        }
        else if(dws.name().equalsIgnoreCase("D-Harai")){
            currency = " yen";
            id = "KB";
            bl = 0.5 * money;
        }
        else{
            currency = " taka";
            id = "NID";
            bl = money;
        }
        balance += bl;
        System.out.print("NID"+NID+": Received " +money+currency+" from "+dws.name()+" account ("+id+dws.getID()+")");
        System.out.println("! Current balance "+balance+" taka...");
    }
}
