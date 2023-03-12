package Builders;

import Components.PCs.PC3;

public class PC3Builder extends PCBuilder{
    @Override
    public void addPC() {
        PC3 pc3 = new PC3();
        getProduct().add(pc3);
    }
}
