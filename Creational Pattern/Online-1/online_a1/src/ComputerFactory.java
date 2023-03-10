import COMPUTER.*;

public class ComputerFactory {
    public Computer getComputer(String st){
        if(st.equalsIgnoreCase("Computer A"))
            return new ComputerA();
        else if(st.equalsIgnoreCase("Computer B"))
            return new ComputerB();
        else if(st.equalsIgnoreCase("Computer C"))
            return new ComputerC();
        else
            System.out.println("Invalid computer name");

        return null;
    }
}
