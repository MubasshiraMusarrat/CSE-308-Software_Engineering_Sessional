import Observer.*;
import Server.ABCServer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ABCServer abc = new ABCServer();
        ArrayList<Observer> User = new ArrayList<Observer>();
        User.add( new PremiumUser(abc,"Nazia"));
        User.add( new RegularUser(abc, "Mubasshira"));

        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("ABC server is operational.");

        while (true){
            System.out.println("Choose any option: ");
            System.out.println("1. Change server state");
            System.out.println("2. Enter user");
            System.out.println("3. Remove user");
            System.out.println("4. Exit");

            s=sc.nextLine();

            if(s.equalsIgnoreCase("1")){
                System.out.println("Server state can be: ");
                System.out.println("1. Operational");
                System.out.println("2. Partially down");
                System.out.println("3. Fully down");

                s= sc.nextLine();
                int temp = Integer.parseInt(s);

                if(temp<1 || temp>3){
                    System.out.println("Invalid state.");
                }
                else {
                    abc.setState(temp-1);
                }
            }

            else if(s.equalsIgnoreCase("2")){
                System.out.println("User type: ");
                System.out.println("1. Premium (more cost)");
                System.out.println("2. Regular");

                s = sc.nextLine();
                int temp = Integer.parseInt(s);

                System.out.println("Enter user name: ");
                String name = sc.nextLine();

                if(temp==1){
                    User.add( new PremiumUser(abc, name));
                    System.out.println("User added: "+User.get(User.size()-1).getType()+" "+User.get(User.size()-1).getName());
                }
                else if(temp==2){
                    User.add( new RegularUser(abc, name));
                    System.out.println("User added: "+User.get(User.size()-1).getType()+" "+User.get(User.size()-1).getName());
                }
                else {
                    System.out.println("Invalid option.");
                }
            }

            else if(s.equalsIgnoreCase("3")){
                System.out.println("Enter user name: ");
                String name = sc.nextLine();

                int i;
                for(i=0;i<User.size();i++){
                    if(User.get(i).getName().equalsIgnoreCase(name)){
                        abc.removeObserver(User.get(i));
                        System.out.println("User removed: "+User.get(i).getType()+" "+User.get(i).getName());
                        break;
                    }
                }
                if(i== User.size()){
                    System.out.println("No user in this name found.");
                }
            }

            else if(s.equalsIgnoreCase("4"))
                break;

            else {
                System.out.println("Invalid option");
                continue;
            }
        }
    }
}
