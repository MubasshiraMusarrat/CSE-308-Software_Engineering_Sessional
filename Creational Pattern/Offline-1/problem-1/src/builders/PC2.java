package builders;

import components.Core;
import components.cooler.Liquid_cooler;
import components.processor.Core_i7;
import factories.GraphicsCardFactory;
import factories.RAMfactory;
import products.Product;

public class PC2 implements PCBuilder{
    private final Product product;

    public PC2(){
        product = new Product();
    }

    @Override
    public void addBaseUnit() {
        product.add(new Core());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i7());
    }

    @Override
    public void addCooler() {
        product.add(new Liquid_cooler());
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
