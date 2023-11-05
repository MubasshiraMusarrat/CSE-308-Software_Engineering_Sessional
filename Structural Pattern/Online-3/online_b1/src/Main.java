import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Akash akash0 = new Akash(0,1000);
        Akash akash1 = new Akash(1,1000);

        Payfren payfren0 = new Payfren(0,10);
        Payfren payfren1 = new Payfren(1,10);
        DWSAdapter PF0 = new DWSAdapter(payfren0);
        DWSAdapter PF1 = new DWSAdapter(payfren1);

        DHarai dharai0 = new DHarai(0,1500);
        DHarai dHarai1 = new DHarai(1,1500);
        DWSAdapter DH0 = new DWSAdapter(dharai0);
        DWSAdapter DH1 = new DWSAdapter(dHarai1);

        akash0.sendMoney(akash1,500);
        akash1.receiveMoney(akash0,500);

        payfren0.sendMoney(payfren1,5);
        payfren1.receiveMoney(payfren0,5);

        dharai0.sendMoney(dHarai1,1000);
        dHarai1.receiveMoney(dharai0,1000);

        PF0.sendMoney(akash0,10);

        PF0.sendMoney(akash0,2);
        akash0.receiveMoney(PF0.getDWS(),2);

        akash1.sendMoney(DH1.getDWS(),500);
        DH1.receiveMoney(akash1,500);

    }
}
