import Beverage.*;
import Decorators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        double total = 0;

        Black_Coffee black_coffee1 = new Black_Coffee();
        Coffee_Beans Americano = new Coffee_Beans(black_coffee1);

        Black_Coffee black_coffee2 = new Black_Coffee();
        Dairy_Cream Espresso = new Dairy_Cream(black_coffee2);

        Milk_Coffee milk_coffee1 = new Milk_Coffee();
        Cinnamon_Powder Cappuccino = new Cinnamon_Powder(milk_coffee1);

        Milk_Coffee milk_coffee2 = new Milk_Coffee();
        Chocolate_Sauce Mocha = new Chocolate_Sauce(milk_coffee2);

        HashMap<Integer,Coffee> h = new HashMap<>(4);
        h.putIfAbsent(1,Americano);
        h.putIfAbsent(2,Espresso);
        h.putIfAbsent(3,Cappuccino);
        h.putIfAbsent(4,Mocha);

        HashMap<Integer,String> name = new HashMap<>(4);
        name.putIfAbsent(1,"Americano");
        name.putIfAbsent(2,"Espresso");
        name.putIfAbsent(3,"Cappuccino");
        name.putIfAbsent(4,"Mocha");


        while(true) {
            System.out.println("Press E to place your order or Press Q to exit.");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("Q")){
                break;
            }
            else if(s.equalsIgnoreCase("E")) {
                System.out.println("Menu: ");
                System.out.println("1. Americano");
                System.out.println("2. Espresso");
                System.out.println("3. Cappuccino");
                System.out.println("4. Mocha");
                s = sc.nextLine();

                int integer = Integer.parseInt(s);
                if(integer < 1 || integer > 4){
                    System.out.println("Invalid Choice");
                }
                else {
                    Coffee c = h.get(integer);
                    String n = name.get(integer);
                    System.out.println("Your ordered coffee: " + n);
                    System.out.println("Ingredients: " + c.getDescription());
                    total += c.getPrice();
                    System.out.println("Price: " + c.getPrice() + " bdt");
                }
            }
            else {
                System.out.println("Invalid option");
            }
        }
        System.out.println("Your total is: " + total + " bdt");
    }
}
