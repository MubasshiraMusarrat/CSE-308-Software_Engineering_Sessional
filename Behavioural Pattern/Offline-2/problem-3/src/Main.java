import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        String s;
        Money m;
        System.out.println("Price of the biscuit is 40 bdt");
        Scanner sc = new Scanner(System.in);

        while (true){
            if(vendingMachine.getCurrentState().stateName().equalsIgnoreCase("Sold Out State")) {
                System.out.println("Out of products");
                System.out.println("Do you want to refill? Y");
                s = sc.nextLine();
                if (s.equalsIgnoreCase("Y")) {
                    vendingMachine.refill();
                }
                else{
                    vendingMachine.collectChange();
                    break;
                }
            }

            System.out.println("Insert Money...");
            System.out.println("1. 1 bdt");
            System.out.println("2. 2 bdt");
            System.out.println("3. 5 bdt");
            System.out.println("4. 10 bdt");
            System.out.println("5. 20 bdt");
            System.out.println("6. 50 bdt");

            s=sc.nextLine();
            if(s.equals("1")) {
                m = Money.ONE;
            }
            else if(s.equals("2")){
                m = Money.TWO;
            }
            else if(s.equals("3")){
                m = Money.FIVE;
            }
            else if(s.equals("4")){
                m = Money.TEN;
            }
            else if(s.equals("5")){
                m = Money.TWENTY;
            }
            else if(s.equals("6")){
                m = Money.FIFTY;
            }
            else {
                System.out.println("Invalid Option.");
                continue;
            }

            vendingMachine.insert(m);

            if(vendingMachine.getCurrentAmount()< vendingMachine.getCost()){
                continue;
            }

            vendingMachine.collectProduct();

            System.out.println("Do you want to continue ordering? Y or N");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("Y")){
                System.out.println("Price of the biscuit is 40 bdt");
            }
            else {
                vendingMachine.collectChange();
                break;
            }
        }
    }
}
