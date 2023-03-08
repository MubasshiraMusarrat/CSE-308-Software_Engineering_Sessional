package builders;

import products.Product;

//basic structure of a pc
public interface PCBuilder {
    void addBaseUnit();
    void addProcessor();
    void addCooler();
    void addDVDPlayer();
    void addRAM(String ram);
    void addGraphicsCard(String gc);

    Product getProduct();
}
