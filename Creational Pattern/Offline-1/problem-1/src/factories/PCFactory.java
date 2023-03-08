package factories;

import builders.*;
import directors.Director;

//pc factory to call director
public class PCFactory {
    public PCBuilder getPCBuilder(String pc, String ram, String gc){
        PCBuilder pcBuilder = null;
        Director director = new Director();

        if(pc.equalsIgnoreCase("1")){
            pcBuilder = new GamingPC();
        }
        else if(pc.equalsIgnoreCase("2")){
            pcBuilder = new PC1();
        }
        else if(pc.equalsIgnoreCase("3")){
            pcBuilder = new PC2();
        }
        else if(pc.equalsIgnoreCase("4")){
            pcBuilder = new PC3();
        }
        else
            System.out.println("Invalid PC option");

        if(pcBuilder != null) {
            director.build(pcBuilder);
            if(ram == null);
               // director.AddRAM(null);
            else if(ram.equalsIgnoreCase("1"))
                director.AddRAM("2666 MHz");
            else if(ram.equalsIgnoreCase("2"))
                director.AddRAM("3200 MHz");
            else
                System.out.println("Invalid RAM option");
            if (gc == null);
                //director.AddGraphicsCard(null);
            else if(gc.equalsIgnoreCase("1"))
                director.AddGraphicsCard("2 GB");
            else if(gc.equalsIgnoreCase("2"))
                director.AddGraphicsCard("4 GB");
            else
                System.out.println("Invalid Graphics Card option");
        }
        return pcBuilder;
    }
}
