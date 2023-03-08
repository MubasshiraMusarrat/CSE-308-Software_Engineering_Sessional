package builders;

import components.Core;
import components.DVD;
import components.processor.Core_i9;
import factories.GraphicsCardFactory;
import factories.RAMfactory;
import products.Product;

public class PC3 implements PCBuilder{
    private final Product product;

    public PC3(){
        product = new Product();
    }
    @Override
    public void addBaseUnit() {
        product.add(new Core());
    }

    @Override
    public void addProcessor() {
        product.add(new Core_i9());
    }

    @Override
    public void addCooler() {

    }

    @Override
    public void addDVDPlayer() {
        product.add(new DVD());
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
