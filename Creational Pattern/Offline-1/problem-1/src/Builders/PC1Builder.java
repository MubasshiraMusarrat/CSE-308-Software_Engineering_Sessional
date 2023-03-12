package Builders;

import Components.PCs.PC1;

public class PC1Builder extends PCBuilder{
    @Override
    public void addPC() {
        PC1 pc1 = new PC1();
        getProduct().add(pc1);
    }
}
