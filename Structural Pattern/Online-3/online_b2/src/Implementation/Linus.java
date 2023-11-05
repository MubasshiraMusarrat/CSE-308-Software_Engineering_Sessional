package Implementation;

public class Linus implements OS {
    @Override
    public void storageModule() {
        System.out.println("Functionality: Store files");
        System.out.println("Storage module");
        System.out.println("OS : Linus");
    }

    @Override
    public void InterfaceModule() {
        System.out.println("Functionality: Interact with the device");
        System.out.println("Interface module");
        System.out.println("OS : Linus");
    }

    @Override
    public void CommunicationModule() {
        System.out.println("Functionality: Communicate among one another");
        System.out.println("Communication module");
        System.out.println("OS : Linus");
    }
}
