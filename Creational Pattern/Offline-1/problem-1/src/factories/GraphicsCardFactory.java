package factories;

import components.Components;
import components.graphicsCard.GB2;
import components.graphicsCard.GB4;

//choose graphics card
public class GraphicsCardFactory {
    public Components getGraphicsCard(String gc){
        if(gc.equalsIgnoreCase("2 GB"))
            return new GB2();
        else if(gc.equalsIgnoreCase("4 GB"))
            return new GB4();
        else {
            return null;
        }
    }
}
