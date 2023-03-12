package Builders;

import Components.Additionals.GraphicsCard.*;
import Components.Additionals.RAM.*;
import Drivers.Product;

public abstract class PCBuilder {
    private final Product pc;
    public PCBuilder(){
        pc = new Product();
    }
    public abstract void addPC();

    public void addRAM(String RAM){
        if(RAM.equalsIgnoreCase("2666 MHz"))
            pc.add(new RAM_2666MHz());
        else if(RAM.equalsIgnoreCase("3200 MHz"))
            pc.add(new RAM_3200MHz());
        else
            System.out.println("Invalid RAM name");
    }

    public void addGraphicsCard(String graphicsCard){
        if(graphicsCard.equalsIgnoreCase("2GB"))
            pc.add(new GB2());
        else if(graphicsCard.equalsIgnoreCase("4GB"))
            pc.add(new GB4());
        else
            System.out.println("Invalid Graphics Card Name");
    }

    public Product getProduct(){
        return pc;
    }

}
