public class DWSAdapter implements DWS{
    private Payfren payfren;
    private DHarai dHarai;
    private Akash akash;
    private int m = 0;

    public DWSAdapter(Akash akash){
        this.akash = akash;
        m = 0;
    }
    public DWSAdapter(Payfren payfren){
        this.payfren = payfren;
        m = 1;
    }

    public DWSAdapter(DHarai dHarai){
        this.dHarai = dHarai;
        m =2;
    }

    @Override
    public String getNID() {
        if( m == 1)
            return payfren.getSSN();
        else if( m == 2)
            return dHarai.getKojinBango();
        else
            return akash.getNID();
    }

    @Override
    public void deposit(double money) {
        if( m == 1)
            payfren.deposit(money*0.01);
        else if( m == 2)
            dHarai.deposit(money*2);
        else
            akash.deposit(money);

    }

    @Override
    public double getCurrentBalance() {
        if( m == 1)
            return payfren.getCurrentBalance()*0.01;
        else if( m == 2)
            return dHarai.getCurrentBalance()*2;
        else
            return akash.getCurrentBalance();
    }

    @Override
    public double sendMoney(String NID2, double money) {
        if( m == 1)
            return payfren.sendMoney(NID2, money*0.01);
        else if( m == 2)
            return dHarai.sendMoney(NID2, money*2);
        else
            return akash.sendMoney(NID2, money);
    }

    @Override
    public void receiveMoney(String NID2, double money) {
        if( m == 1)
            payfren.receiveMoney(NID2, money*0.01);
        else if( m == 2)
            dHarai.receiveMoney(NID2, money*2);
        else
            akash.receiveMoney(NID2, money);
    }
}
