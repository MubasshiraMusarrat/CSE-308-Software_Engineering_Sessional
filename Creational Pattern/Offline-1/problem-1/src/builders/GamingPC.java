package builders;

import components.Core;
import components.processor.AMD_RYZEN_7;
import factories.GraphicsCardFactory;
import factories.RAMfactory;
import products.Product;

public class GamingPC implements PCBuilder{
    private final Product product;

    public GamingPC(){
        product = new Product();
    }
    @Override
    public void addBaseUnit() {
        product.add(new Core());
    }

    @Override
    public void addProcessor() {
        product.add(new AMD_RYZEN_7());
    }

    @Override
    public void addCooler() {

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
