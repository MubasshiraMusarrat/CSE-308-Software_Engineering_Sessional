import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NID: ");
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println("Enter deposit: ");
        s = sc.nextLine();
        int j = Integer.parseInt(s);
        Akash akash = new Akash("NID0",1000);
        Akash akash1 = new Akash("NID1",1000);

        System.out.println("Enter SSN: ");
        s = sc.nextLine();
        i = Integer.parseInt(s);
        System.out.println("Enter deposit: ");
        s = sc.nextLine();
        j = Integer.parseInt(s);
        Payfren payfren = new Payfren("SSN0",10);
        Payfren payfren1 = new Payfren("SSN1",10);

        System.out.println("Enter kojin bango: ");
        s = sc.nextLine();
        i = Integer.parseInt(s);
        System.out.println("Enter deposit: ");
        s = sc.nextLine();
        j = Integer.parseInt(s);
        DHarai dHarai = new DHarai("KB0",1500);
        DHarai dHarai1 = new DHarai("KB1",1500);

        DWSAdapter adapter1 = new DWSAdapter(akash);
        DWSAdapter adapter2 = new DWSAdapter(payfren);
        DWSAdapter adapter3 = new DWSAdapter(dHarai);

        akash.sendMoney(akash1.getNID(), 500);
        akash1.receiveMoney(akash.getNID(), 500);

        payfren.sendMoney(payfren1.getSSN(), 5);
        payfren.sendMoney(payfren.getSSN(), 5);

        dHarai.sendMoney(dHarai1.getKojinBango(), 1000);
        dHarai.receiveMoney("KB0",2500);

        adapter2.sendMoney("NID0",10);
        adapter2.sendMoney("NID1",3);
        adapter2.receiveMoney("NID0",200);

        adapter3.sendMoney("NID0",500);
        adapter3.receiveMoney("NID1",3500);

    }
}
