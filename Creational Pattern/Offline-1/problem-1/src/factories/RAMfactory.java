package factories;

import components.Components;
import components.ram.RAM_2666MHz;
import components.ram.RAM_3200MHz;

//choose RAM
public class RAMfactory {
    public Components getRAM(String ram){
        if(ram.equalsIgnoreCase("2666 MHz"))
            return new RAM_2666MHz();
        else if(ram.equalsIgnoreCase("3200 MHz"))
            return new RAM_3200MHz();
        else
        return null;
    }
}
