import Abstraction.Device;
import Abstraction.Notebook;
import Abstraction.Smartphones;
import Implementation.Linus;
import Implementation.OS;
import Implementation.Windoors;

public class Main {
    public static void main(String[] args) {
        OS windoors = new Windoors();
        OS linus = new Linus();
        Device notebook = new Notebook(windoors);
        notebook.storageModule();
        notebook.interfaceModule();
        notebook.communicationModule();

        notebook = new Notebook(linus);
        notebook.storageModule();
        notebook.interfaceModule();
        notebook.communicationModule();

        Device smartphone = new Smartphones(windoors);
        smartphone.storageModule();
        smartphone.interfaceModule();
        smartphone.communicationModule();

        smartphone = new Smartphones(linus);
        smartphone.storageModule();
        smartphone.interfaceModule();
        smartphone.communicationModule();
    }
}
