package Driver;

import Builder.BurgerBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        Director director = new Director(burgerBuilder);
        int pattie = 1, cheese = 0, bbqSauce = 0, salad = 0;

        System.out.println("Press 'O' to order");
        a = sc.nextLine();

        if (a.equalsIgnoreCase("O")) {
            while (true) {
                System.out.println("Do you want to add:");
                System.out.println("1. Extra patties");
                System.out.println("2. Cheese");
                System.out.println("3. BBQ Sauce");
                System.out.println("4. Salad");
                System.out.println("5. Exit");
                int option = Integer.parseInt(sc.nextLine());

                if (option == 5) {
                    break;
                } else if (option < 1 || option > 5) {
                    System.out.println("Invalid option");
                } else {
                    System.out.println("How many?");
                    int cnt = Integer.parseInt(sc.nextLine());
                    if (option == 1) pattie += cnt;
                    else if (option == 2) cheese += cnt;
                    else if (option == 3) bbqSauce += cnt;
                    else if (option == 4) salad += cnt;
                }
            }
            director.makeBurger(pattie, cheese, bbqSauce, salad);
        }
        director.getBurger().showOrder();
    }
}