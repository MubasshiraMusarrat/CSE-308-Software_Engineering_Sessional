import Builders.*;
import Drivers.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        PCBuilder pcBuilder;
        Director director;
        ArrayList<Product> pcs = new ArrayList<>();
        int RAM1 = 0;
        int RAM2 = 0;
        int graphicsCard1 = 0;
        int graphicsCard2 = 0;
        double totalCost = 0;

        System.out.println("You have to order at least once.");
        do{
            System.out.println("Press 'O' to order and 'E' to exit");
            a = sc.nextLine();

            if(a.equalsIgnoreCase("o")){
                System.out.println("1. Gaming PC");
                System.out.println("2. PC1 (Core i5)");
                System.out.println("3. PC2 (Core i7)");
                System.out.println("4. PC3 (Core i9)");
                int i = Integer.parseInt(sc.nextLine());
                if(i <1 || i>4)     {
                    System.out.println("Invalid option");
                    continue;
                }
                else if(i == 1) pcBuilder = new GamingPCBuilder();
                else if(i == 2) pcBuilder = new PC1Builder();
                else if(i == 3) pcBuilder = new PC2Builder();
                else pcBuilder = new PC3Builder();

                while(true){
                    System.out.println("Do you want to add: ");
                    System.out.println("1. 8 GB DDR4 RAM");
                    System.out.println("2. Graphics Card");
                    System.out.println("3. Exit");
                    i = Integer.parseInt(sc.nextLine());

                    if(i <1 || i>3)     {
                        System.out.println("Invalid option");
                    }
                    else if(i == 1){
                        if(RAM1>0 || RAM2>0){
                            System.out.println("These will be added with the previous ones");
                        }
                        System.out.println("Which type of RAM do you want?");
                        System.out.println("1. 2666 MHz");
                        System.out.println("2. 3200 MHz");
                        i = Integer.parseInt(sc.nextLine());
                        if(i <1 || i>2)     {
                            System.out.println("Invalid option");
                        }
                        else if(i ==1 ) RAM1++;
                        else RAM2++;
                    }

                    else if(i == 2){
                        if(graphicsCard1>0 || graphicsCard2>0){
                            System.out.println("These will be added with the previous ones");
                        }
                        System.out.println("Which type of graphics card do you want?");
                        System.out.println("1. 2 GB");
                        System.out.println("2. 4 GB");
                        i = Integer.parseInt(sc.nextLine());
                        if(i <1 || i>2)     {
                            System.out.println("Invalid option");
                        }
                        else if(i ==1 ) graphicsCard1++;
                        else graphicsCard2++;
                    }

                    else
                        break;
                }
                director = new Director(pcBuilder);
                director.make(RAM1,RAM2,graphicsCard1,graphicsCard2);
                pcs.add(director.getPC());
                RAM1=RAM2=graphicsCard1=graphicsCard2=0;
            }
            else {
                System.out.println("Invalid option");
            }
        }while (!(a.equalsIgnoreCase("E")));
        for(int j = 0; j<pcs.size(); j++){
            System.out.println("Order no: "+(j+1));
            pcs.get(j).showOrder();
            totalCost += pcs.get(j).getTotalCost();
        }
        System.out.println("Total cost of your order: " + totalCost + " BDT");
    }
}