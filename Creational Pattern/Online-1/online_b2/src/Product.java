import Parts.Parts;

import java.util.LinkedList;

public class Product {
    private double totalCost;
    private final LinkedList<Parts> burger;

    public Product() {
        this.totalCost = 0;
        this.burger = new LinkedList<>();
    }

    public void add(Parts c){
        burger.add(c);
    }

    public void show(){
        System.out.println("Your order is: ");
        System.out.println("Base components:");
        Parts p = burger.get(0);
        System.out.println(p.description()+"   Quantity: "+p.Quantity()+ "   Price each: "+p.Price()+ " BDT   Total: "+ (p.Quantity()* p.Price())+" BDT");
        totalCost+=p.Quantity()*p.Price();

        p = burger.get(1);
        System.out.println(p.description()+"   Quantity: 1   Price each: "+p.Price()+ " BDT   Total: "+  p.Price()+" BDT");
        totalCost+=p.Price();
        System.out.println("Base cost: "+totalCost+" BDT");

        double additionalCost=0;
        System.out.println("Additional components:");
        System.out.println(p.description()+"   Quantity: "+(p.Quantity()-1)+"   Price each: "+p.Price()+ " BDT   Total: "+ ((p.Quantity()-1)*p.Price())+" BDT");
        totalCost+= (p.Quantity()-1)* p.Price();
        additionalCost+= (p.Quantity()-1)* p.Price();

        for(int i=2; i<burger.size(); i++){
            if(burger.get(i)!=null) {
                p = burger.get(i);
                System.out.println(p.description()+"   Quantity: "+p.Quantity()+ "   Price each: "+p.Price()+ " BDT   Total: "+(p.Quantity()* p.Price())+" BDT");
                additionalCost+=p.Quantity()* p.Price();
                totalCost+= p.Quantity()*p.Price();
            }
        }
        System.out.println("Additional Cost: "+additionalCost+" BDT");
        System.out.println("Total Cost: "+ totalCost+" BDT");
    }
}
