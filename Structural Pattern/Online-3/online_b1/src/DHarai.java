public class DHarai implements DWS {
    private int kojinBango;
    private double balance;

    public DHarai(int kb, double balance) {
        this.kojinBango = kb;
        this.balance = balance;
    }
    @Override
    public String name(){
        return "D-Harai";
    }
    @Override
    public int getID() {
        return kojinBango;
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
        else if(dws.name().equalsIgnoreCase("akash")){
            id = "NID";
        }
        else{
            id = "KB";
        }
        if(balance<money){
            System.out.println("KB"+kojinBango+": Insufficient balance to send "+money+" yen to "+dws.name()+" account ( "+id+dws.getID()+")");
        }
        else {
            balance -= money;
            System.out.print("KB" + kojinBango + ": Sending " + money + " yen to " + dws.name() + " account ( " + id + dws.getID() + ")");
            System.out.println("...Current balance " + balance + " yen...");
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
            bl = money * 200;
        }
        else if(dws.name().equalsIgnoreCase("akash")){
            currency = " taka";
            id = "NID";
            bl = money * 2;
        }
        else{
            currency = " yen";
            id = "KB";
            bl = money;
        }
        balance += bl;
        System.out.print("KB"+kojinBango+": Received " +money+currency+" from "+dws.name()+" account ("+id+dws.getID()+")");
        System.out.println("! Current balance "+balance+" yen...");
    }
}