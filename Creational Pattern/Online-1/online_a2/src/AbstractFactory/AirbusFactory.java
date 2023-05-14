package AbstractFactory;

import Engine.*;
import Wing.*;

public class AirbusFactory implements PlaneFactory {
    @Override
    public String getCompany() {
        return "Airbus";
    }

    @Override
    public Engine getEngine() {
        return new AirbusEngine();
    }

    @Override
    public Wing getWing() {
        return new AirbusWing();
    }
}
