import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        double total;
        int penalty;

        MakersSolution makersSolution = new MakersSolution();
        PoisonIvy PolyjuicePotion = new PoisonIvy(makersSolution);
        UnicornHorn Felixfelicies = new UnicornHorn(makersSolution);
        DragonKidney Veritaserum = new DragonKidney(makersSolution);
        ChineseChompingCabbage SkeleGro = new ChineseChompingCabbage(makersSolution);

        HashMap<Integer,String> name = new HashMap<>(4);
        name.putIfAbsent(1,"Polyjuice Potion(transformation potion)");
        name.putIfAbsent(2,"Felix Felicis (liquid luck)");
        name.putIfAbsent(3,"Veritaserum (truth serum),");
        name.putIfAbsent(4,"Skele-Gro(bone regrowing potion)");

        HashMap<Integer,Potion> h = new HashMap<>(4);
        h.putIfAbsent(1,PolyjuicePotion);
        h.putIfAbsent(2,Felixfelicies);
        h.putIfAbsent(3,Veritaserum);
        h.putIfAbsent(4,SkeleGro);

        while (true){
            System.out.println("Press C to continue or Press Q to exit.");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("Q")){
                break;
            }
            else if(s.equalsIgnoreCase("C")) {
                System.out.println("Enter name of the potion:");
                System.out.println("1. Polyjuice Potion(transformation potion)");
                System.out.println("2. Felix Felicis (liquid luck)");
                System.out.println("3. Veritaserum (truth serum) ");
                System.out.println("4. Skele-Gro(bone regrowing potion)");
                s = sc.nextLine();
                int integer = Integer.parseInt(s);
                if(integer < 1 || integer > 4){
                    System.out.println("Invalid Choice");
                }
                else {
                    Potion potion = h.get(integer);
                    System.out.println("Enter amount of jars: ");
                    s = sc.nextLine();
                    int amount = Integer.parseInt(s);
                    String n = name.get(integer);
                    System.out.println("Potion: "+n);
                    System.out.println("Ingredients: "+potion.getName());
                    total = potion.getPrice()*25*amount;
                    System.out.println("Cost: "+total+" $");
                    penalty = amount * potion.numberOfIngredients() * 25 * 2;
                    System.out.println("Maximum penalty: "+penalty+ " points");
                }
            }
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
