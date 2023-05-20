import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static Base root;
    private static Base curr;

    private static final ArrayList<String> Companies = new ArrayList<>();
    private static final ArrayList<String> Managers = new ArrayList<>();
    private static final ArrayList<String> Developers = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);

    private static boolean flag = false, IsManager = false;

    public static void createCompany(String c){
        //checks if the company already exists
        for (String name : Companies) {
            if (name.equalsIgnoreCase(c)) {
                System.out.println("There is already a company with the name: "+c);
                System.out.println("Company: "+ c +" not created");
                return;
            }
        }

        //Create  a new company
        Companies.add(c);
        Base b = new Composite(c,"Company",null,root);
        root.addChild(b);
        System.out.println(c + " company successfully created.");
        curr = b;
    }

    public static void createManager(String m){
        //checks if a manager with the same name exists
        for(String name : Managers){
            if (name.equalsIgnoreCase(m)) {
                System.out.println("There is already a project manager with the name: "+m);
                System.out.println("Project manager: "+ m +" not created");
                return;
            }
        }

        //checks if the name exists for a developer
        for (String name : Developers) {
            if (name.equalsIgnoreCase(m)) {
                System.out.println("There is a developer with the name: "+m);
                System.out.println("Company: "+ m +" not created");
                return;
            }
        }

        System.out.println("Enter name of the company: ");
        String c = sc.nextLine();
        boolean flagC = false;

        //checks if the company exists
        for(String name  : Companies) {
            if (name.equalsIgnoreCase(c)) {
                flagC = true;
                break;
            }
        }

        //creates a company with the input name if it already doesn't exist
        if(!flagC){
                System.out.println("No company with this name exists");
                System.out.println("Do you want to create one? y or n");
                String st = sc.nextLine();
                if(st.equalsIgnoreCase("n")){
                    System.out.println("Project manager: "+ m +" not created");
                    return;
                }
                else if(st.equalsIgnoreCase("y")){
                    createCompany(c);
                }
                else {
                    System.out.println("Invalid option");
                    System.out.println("Project manager: "+ m +" not created");
                    return;
                }
            }

        //get the running project list of the company with given name
        goTo(c);
        ArrayList<Base> temp = curr.getChildList();
        ArrayList<String> Projects = new ArrayList<>();
        for (Base b : temp) {
            Projects.add(b.getCurrProject());
        }

        System.out.println("Enter name of the project:");
        String p = sc.nextLine();

        //checks if the project already exists
        for(String name : Projects){
            if (name.equalsIgnoreCase(p)) {
                System.out.println("There is already a project manager for the project: "+p);
                System.out.println("Project manager: "+ m +" not created");
                return;
            }
        }

        //Create a new project manager
        Managers.add(m);
        Base b = new Composite(m,"Project Manager",p,curr);
        curr.addChild(b);
        System.out.println("Project manager: "+m+" successfully created");
        IsManager = true;
        curr = b;
    }

    public static void createDeveloper(String d){
        //checks if a developer with the same name exists
        for(String name : Developers){
            if (name.equalsIgnoreCase(d)) {
                System.out.println("There is already a software developer with the name: "+d);
                System.out.println("Software developer: "+ d +" not created");
                return;
            }
        }

        //checks if the name exists for a project manager
        for (String name : Managers) {
            if (name.equalsIgnoreCase(d)) {
                System.out.println("There is a project manager with the name: "+d);
                System.out.println("Company: "+ d +" not created");
                return;
            }
        }

        System.out.println("Enter name of the project manager: ");
        String m = sc.nextLine();
        boolean flagM = false;

        //checks if the project manager exists
        for(String name  : Managers) {
            if (name.equalsIgnoreCase(m)) {
                flagM = true;
                break;
            }
        }

        //creates a project manager with the input name if it already doesn't exist
        if(!flagM){
            System.out.println("No project manager with this name exists");
            System.out.println("Do you want to create one? y or n");
            String st = sc.nextLine();
            if(st.equalsIgnoreCase("n")){
                System.out.println("Software developer: "+ d +" not created");
                return;
            }
            else if(st.equalsIgnoreCase("y")){
                IsManager = false;
                createManager(m);
            }
            else {
                System.out.println("Invalid option");
                System.out.println("Software developer: "+ d +" not created");
                return;
            }
        }

        //Creates a new software developer
        if(IsManager) {  //flag to check if the manager exists
            Developers.add(d);
            goTo(m);
            //developers current project is the managers current project
            Base b = new Leaf(d, "Developer", curr.getCurrProject(), curr);
            curr.addChild(b);
            System.out.println("Developer: " + d + " successfully created");
            curr = b;
        }
        else {
            System.out.println("Software developer: "+ d +" not created");
        }
    }

    public static void removeDeveloper(String d){
        goTo(d);
        if(!flag){
            System.out.println("Developer not found");
            return;
        }

        //remove the developer
        Developers.remove(curr.getName());
        Base parent = curr.getParent();
        parent.removeChild(curr);
        curr = parent;
        System.out.println("Developer: " +d+ " successfully removed");
    }

    public static void removeManager(String m){
        goTo(m);
        if(!flag){
            System.out.println("Project manager not found");
            return;
        }

        //remove all developer under current manager
        ArrayList<Base> children= curr.getChildList();
        for(Base temp : children){
            Developers.remove(temp.getName());
        }
        curr.removeAll();

        //remove the project manager
        Managers.remove(curr.getName());
        Base parent = curr.getParent();
        parent.removeChild(curr);
        curr = parent;
        System.out.println("Project manager: " +m+ " successfully removed");
    }

    public static void removeCompany(String c){
        goTo(c);
        if(!flag){
            System.out.println("Company not found");
            return;
        }

        //remove all the project managers under current company
        ArrayList<Base> children_manager = curr.getChildList();
        for (Base tempM : children_manager) {
            //remove all the developers under current company
            ArrayList<Base> children_dev= tempM.getChildList();
            for(Base tempD : children_dev){
                Developers.remove(tempD.getName());
            }
            tempM.removeAll();
            Managers.remove(tempM.getName());
        }
        curr.removeAll();

        //remove the company
        Companies.remove(curr.getName());
        Base parent = curr.getParent();
        parent.removeChild(curr);
        System.out.println("Company: " +c+ " successfully removed");

        if(root.getChildCount()>0){
            curr = root.getChildList().get(0);
        }
        else {
            curr = parent;
        }
    }

    public static void search(Base b,String st){
        if(b.getName().equalsIgnoreCase(st)){
            flag = true;
            curr = b;
            return;
        }

        if(b.getRole().equalsIgnoreCase("Developer")){
            return;
        }

        Iterator<Base> it = b.getChildList().iterator();
        while(it.hasNext() && !flag) {
            search(it.next(),st);
        }
    }

    public static void goTo(String g){
        flag = false;
        search(root,g);
    }

    public static void main(String[] args) {
        root = new Composite("Software Industry","Industry", null,null);
        curr = root;
        int choice;

        while(true){
            root.PrintHierarchy(0);
            if(!(curr.getRole().equalsIgnoreCase("Industry"))){
                System.out.println("You're currently viewing: "+curr.getRole()+" "+curr.getName());
            }

            System.out.println("1. Create");
            System.out.println("2. Print Details"); //details of the current component
            System.out.println("3. Print Hierarchy"); // hierarchy under current component
            System.out.println("4. Remove Current");
            System.out.println("5. Remove");
            System.out.println("6. Goto"); //using goto to parse the tree
            System.out.println("7. Exit");

            String s = sc.nextLine();
            choice = Integer.parseInt(s);

            if(choice == 1){
                System.out.println("1. Create Company");
                System.out.println("2. Create Project Manager");
                System.out.println("3. Create Developer");

                s = sc.nextLine();
                choice = Integer.parseInt(s);

                if(choice == 1) {
                    System.out.println("Enter the name of the company: ");
                    s = sc.nextLine();
                    createCompany(s);
                }

                else if(choice == 2) {
                    System.out.println("Enter the name of the project manager: ");
                    s = sc.nextLine();
                    createManager(s);
                }

                else if(choice == 3){
                    System.out.println("Enter the name of the developer: ");
                    s = sc.nextLine();
                    createDeveloper(s);
                }

                else {
                    System.out.println("Invalid choice");
                }
            }

            else if(choice == 2){
                curr.PrintDetails();
            }

            else if(choice == 3){
                curr.PrintHierarchy(0);
            }

            else if(choice == 4){
                if(curr.getRole().equalsIgnoreCase("Developer")){
                    removeDeveloper(curr.getName());
                }
                else if(curr.getRole().equalsIgnoreCase("Project Manager")) {
                    removeManager(curr.getName());
                }
                else if(curr.getRole().equalsIgnoreCase("Company")){
                    removeCompany(curr.getName());
                }
                else {
                    System.out.println("Nothing to remove");
                }
            }

            else if (choice == 5){
                System.out.println("1. Remove Developer");
                System.out.println("2. Remove Project Manager");
                System.out.println("3. Remove Company");

                s = sc.nextLine();
                choice = Integer.parseInt(s);

                if(choice == 1){
                    System.out.println("Enter the name of the developer: ");
                    s = sc.nextLine();
                    removeDeveloper(s);
                }

                else if(choice == 2){
                    System.out.println("All developers under the project manager will be deleted");
                    System.out.println("Do you wish to continue? y or n");

                    s = sc.nextLine();
                    if(s.equalsIgnoreCase("y")){
                        System.out.println("Enter the name of the project manager: ");
                        s = sc.nextLine();
                        removeManager(s);
                    }

                    else {
                        if(!(s.equalsIgnoreCase("n"))) {
                            System.out.println("Invalid option");
                        }
                    }
                }

                else if(choice == 3){
                    System.out.println("All project managers & developers under the company will be deleted");
                    System.out.println("Do you wish to continue? y or n");

                    s = sc.nextLine();
                    if(s.equalsIgnoreCase("y")){
                        System.out.println("Enter the name of the company: ");
                        s = sc.nextLine();
                        removeCompany(s);
                    }

                    else {
                        if(!(s.equalsIgnoreCase("n"))) {
                            System.out.println("Invalid option");
                        }
                    }
                }

                else{
                    System.out.println("Invalid choice");
                }
            }

            else if(choice == 6){
                System.out.println("Enter name: ");
                s = sc.nextLine();

                goTo(s);
                if(!flag){
                    System.out.println("Name not found");
                }
            }

            else if(choice == 7) { break; }

            else {
                System.out.println("Invalid option");
            }
        }
    }
}
