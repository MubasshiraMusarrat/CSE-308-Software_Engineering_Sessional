package Components.PCs;

import Components.Component;

public class PC implements Component {
    private final String name;
    private String processor;
    private String addON = "";
    private String components = "";
    private double basePrice,processorPrice,addOnPrice;

    public PC(String name){
        this.name = name;
        this.basePrice = 70000;
        this.components += "CPU, Motherboard, 1TB HDD, ";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return basePrice+processorPrice+addOnPrice;
    }
    public double getBasePrice(){
        return basePrice;
    }
    public void setProcessor(String processor, double price){
        this.processor = processor;
        this.processorPrice = price;
    }

    public String getProcessor() { return processor;}

    public double getProcessorPrice() { return processorPrice;}

    public void addOns( String name, double price){
        this.addON = name;
        this. addOnPrice = price;
    }

    public String getAddON() { return addON; }

    public double getAddOnPrice() { return addOnPrice; }

    public String getComponents(){
        components += (processor+", ");
        components += addON;
        return components;
    }
}
