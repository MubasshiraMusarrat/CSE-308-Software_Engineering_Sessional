package Drivers;

import Components.Component;
import Components.PCs.PC;

import java.util.LinkedList;

public class Product {
    private double totalCost;
    private final LinkedList<Component> items;

    public Product() {
        this.totalCost = 0;
        this.items = new LinkedList<>();
    }

    public void add(Component c){
        items.add(c);
        totalCost += c.getPrice();
    }
    public double getTotalCost(){
        return totalCost;
    }
    public void showOrder(){
        int ram1 = 0;
        int ram2 = 0;
        int graphicsCard1 = 0;
        int graphicsCard2 = 0;

        PC pc = (PC) items.get(0);
        System.out.println("Your PC: "+pc.getName());
        System.out.println("Components: "+pc.getComponents());
        System.out.println("Base Price : "+pc.getBasePrice()+" BDT");
        System.out.println("Added "+pc.getProcessorPrice()+" BDT for "+pc.getProcessor());

        if(!(pc.getAddON().equalsIgnoreCase(""))){
            System.out.println("Added "+pc.getAddOnPrice()+" BDT for "+pc.getAddON());
        }
        System.out.println("Total: "+pc.getPrice()+" BDT");

        for(int i = 1 ; i < items.size(); i++){
            if(items.get(i).getName().equalsIgnoreCase("8GB DDR4 RAM (2666MHz)")) ram1++;
            else if(items.get(i).getName().equalsIgnoreCase("8GB DDR4 RAM (3200MHz)")) ram2++;
            else if(items.get(i).getName().equalsIgnoreCase("Graphics Card (2GB)")) graphicsCard1++;
            else if(items.get(i).getName().equalsIgnoreCase("Graphics Card (4GB)")) graphicsCard2++;
            else
                System.out.println("Invalid item");
        }

        if(ram1 > 0){
            System.out.println(ram1 +" x 8GB DDR4 RAM (2666MHz)");
            System.out.println("Extra 2620 BDT for each RAM");
            System.out.println("Added " + (ram1 * 2620) +" BDT");
        }

        if(ram2 > 0){
            System.out.println(ram2 +" x 8GB DDR4 RAM (3200MHz)");
            System.out.println("Extra 2950 BDT for each RAM");
            System.out.println("Added " + (ram2 * 2950) + " BDT");
        }

        if(graphicsCard1 > 0){
            System.out.println(graphicsCard1+" x Graphics Card (2GB)");
            System.out.println("Extra 6500 BDT for each Card");
            System.out.println("Added " + (graphicsCard1 * 6500) + " BDT");
        }

        if(graphicsCard2 > 0){
            System.out.println(graphicsCard2+" x Graphics Card (4GB)");
            System.out.println("Extra 7600 BDT for each Card");
            System.out.println("Added " + (graphicsCard2 * 7600) + " BDT");
        }

        System.out.println("Total price: "+totalCost+" BDT");
    }
}
