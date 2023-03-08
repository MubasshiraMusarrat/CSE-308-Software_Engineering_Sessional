package products;

import java.util.LinkedList;

import components.*;

// adding the components one by one & calculating the final product
public class Product {
    private int totalCost;
    private final LinkedList<Components>components;

    public Product() {
        this.totalCost = 0;
        this.components = new LinkedList<>();
    }

    public void add(Components c){
        components.add(c);
        totalCost += c.getPrice();
    }

    public void show(){
        System.out.println("Your order is: ");
        System.out.println("Base components:");
        Components pc = components.get(0);
        System.out.println(pc.getDescription()+"\t----price: "+pc.getPrice()+" BDT");
        System.out.println("Added components:");
        for(int i=1; i<components.size(); i++){
            if(components.get(i)!=null) {
                pc = components.get(i);
                System.out.println(i+". "+pc.getDescription()+"\t----price: "+ pc.getPrice()+" BDT");
            }
        }
        System.out.println("Total price: "+ totalCost+" BDT");
    }
}
