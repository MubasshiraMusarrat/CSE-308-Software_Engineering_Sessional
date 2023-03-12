package Builders;

import Components.PCs.PC2;

public class PC2Builder extends PCBuilder{
    @Override
    public void addPC() {
        PC2 pc2 = new PC2();
        getProduct().add(pc2);
    }
}
