package directors;

import builders.PCBuilder;

//to call the components of a pc
public class Director {
    private PCBuilder pcBuilder;

    public void build(PCBuilder pcBuilder){
        this.pcBuilder = pcBuilder;
        this.pcBuilder.addBaseUnit();
        this.pcBuilder.addProcessor();
        this.pcBuilder.addCooler();
        this.pcBuilder.addDVDPlayer();
    }

    public void AddRAM(String ram){
        this.pcBuilder.addRAM(ram);
    }

    public void AddGraphicsCard(String gc){
        this.pcBuilder.addGraphicsCard(gc);
    }
}
