package Driver;

import Builders.ChocolateShakeBuilder;
import Builders.CoffeeShakeBuilder;
import Builders.ShakeBuilder;
import Builders.ZeroShakeBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShakeBuilder shakeBuilder;
        Director director;
        ArrayList<Product> shakes = new ArrayList<>();
        boolean lactoseFree;
        int candy = 0,cookie = 0;
        double totalCost = 0;

        while(true){
            System.out.println("Press 'O' to order");
            String a = sc.nextLine();

            if(a.equalsIgnoreCase("O")) {
                System.out.println("1. Chocolate Shake");
                System.out.println("2. Coffee Shake");
                System.out.println("3. Zero Shake");
                int i = Integer.parseInt(sc.nextLine());
                if(i <0 || i>3)     {
                    System.out.println("Invalid option");
                    continue;
                }
                else if(i == 1) shakeBuilder = new ChocolateShakeBuilder();
                else if(i == 2) shakeBuilder = new CoffeeShakeBuilder();
                else shakeBuilder = new ZeroShakeBuilder();

                System.out.println("Do you want almond milk instead of normal milk? y or n");
                a = sc.nextLine();
                if(a.equalsIgnoreCase("y")) lactoseFree = true;
                else if(a.equalsIgnoreCase("n")) lactoseFree = false;
                else {
                    System.out.println("Invalid option");
                    System.out.println("Adding normal milk");
                    lactoseFree = false;
                }

                do {
                    System.out.println("Do you want candy as topping?y or n");
                    a = sc.nextLine();
                    if (a.equalsIgnoreCase("y")) {
                        System.out.println("How many?");
                        if(candy>0){
                            System.out.println("These will be added with the previous ones");
                        }
                        candy += Integer.parseInt(sc.nextLine());
                    } else if (a.equalsIgnoreCase("n")) candy += 0;
                    else {
                        System.out.println("Invalid option");
                        System.out.println("No candies added");
                        candy += 0;
                    }

                    System.out.println("Do you want cookie as topping?y or n");
                    a = sc.nextLine();
                    if (a.equalsIgnoreCase("y")) {
                        System.out.println("How many?");
                        if(cookie>0){
                            System.out.println("These will be added with the previous ones");
                        }
                        cookie += Integer.parseInt(sc.nextLine());
                    } else if (a.equalsIgnoreCase("n")) cookie += 0;
                    else {
                        System.out.println("Invalid option");
                        System.out.println("No cookies added");
                        cookie += 0;
                    }

                    System.out.println("Press 'E' to close this order or press any other to continue");
                    a = sc.nextLine();
                } while (!a.equalsIgnoreCase("E"));

                director = new Director(shakeBuilder);
                director.produceShake(lactoseFree,candy,cookie);
                shakes.add(director.getShake());
                candy = cookie = 0;

                System.out.println("Press E to close ordering or press any other to continue ordering");
                a = sc.nextLine();
                if(a.equalsIgnoreCase("E")) break;
            }
            else {
                System.out.println("Invalid option");
            }
        }
        for(int j = 0; j<shakes.size(); j++){
            System.out.println("Order no: "+(j+1));
            shakes.get(j).showOrder();
            totalCost += shakes.get(j).getTotalCost();
        }
        System.out.println("Total cost of the order: "+totalCost+" taka");
    }
}
