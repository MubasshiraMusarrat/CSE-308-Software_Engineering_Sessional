package Drivers;

import Builders.PCBuilder;

public class Director {
    private PCBuilder pcBuilder;

    public Director(PCBuilder pcBuilder){
        this.pcBuilder = pcBuilder;
    }

    public void make(int ram1cnt, int ram2cnt,int graphics1cnt, int graphics2cnt){
        pcBuilder.addPC();
        for(int i=1; i<=ram1cnt; i++)
                pcBuilder.addRAM("2666 MHz");
        for(int i=1; i<=ram2cnt; i++)
            pcBuilder.addRAM("3200 MHz");
        for(int i=1; i<=graphics1cnt; i++)
            pcBuilder.addGraphicsCard("2GB");
        for(int i=1; i<=graphics2cnt; i++)
            pcBuilder.addGraphicsCard("4GB");
    }

    public Product getPC(){
        return pcBuilder.getProduct();
    }
}
