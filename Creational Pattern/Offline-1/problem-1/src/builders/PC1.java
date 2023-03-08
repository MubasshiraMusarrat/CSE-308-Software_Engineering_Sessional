package builders;

import components.Core;
import components.cooler.CPU_cooler;
import components.processor.Core_i5;
import factories.GraphicsCardFactory;
import factories.RAMfactory;
import products.Product;

public class PC1 implements PCBuilder{
    private final Product product;

    public PC1(){
        product = new Product();
    }

    @Override
    public void addBaseUnit() {
        product.add(new Core());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i5());
    }

    @Override
    public void addCooler() {
            product.add(new CPU_cooler());
    }

    @Override
    public void addDVDPlayer() {

    }

    @Override
    public void addRAM(String ram) {
        RAMfactory ramFactory = new RAMfactory();
        product.add(ramFactory.getRAM(ram));
    }

    @Override
    public void addGraphicsCard(String gc) {
        GraphicsCardFactory graphicsCardFactory = new GraphicsCardFactory();
        product.add(graphicsCardFactory.getGraphicsCard(gc));
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
