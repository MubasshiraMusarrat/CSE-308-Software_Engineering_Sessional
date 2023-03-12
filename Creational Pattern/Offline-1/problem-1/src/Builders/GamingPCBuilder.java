package Builders;

import Components.PCs.GamingPC;

public class GamingPCBuilder extends PCBuilder{
    @Override
    public void addPC() {
        GamingPC gamingPC = new GamingPC();
        getProduct().add(gamingPC);
    }
}
