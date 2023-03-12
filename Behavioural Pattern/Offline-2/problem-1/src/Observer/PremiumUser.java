package Observer;

import Server.ABCServer;

import java.util.Scanner;

public class PremiumUser implements Observer,DisplayElement{
    private ABCServer server;
    private String name;
    private int state; //similar to server

    public PremiumUser(ABCServer abc, String s){
        this.server = abc;
        server.registerObserver(this);
        this.name = s;
        state = 0;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getType() { return "Premium User";}

    @Override
    public void update() {
        System.out.println(getType()+" "+name+":");
        if(server == null){
            System.out.println("No server detected.");
            return;
        }

    if(server.getPrevState() == server.getCurrState()){
        System.out.println("No change in state.");
        return;
    }

        Scanner sc = new Scanner(System.in);
        String s;

    if(server.getPrevState()==0 && server.getCurrState()==1){
        System.out.println("Which service do you want to use?");
        System.out.println("1. TWO SERVER ( partially from ABC & DEF)");
        System.out.println("2. ONE SERVER ( completely DEF)");
        s = sc.nextLine();

        if(s.equalsIgnoreCase("1")){
            state = 1;
        }
        else if(s.equalsIgnoreCase("2")){
            state = 2;
        }
        else {
            System.out.println("Invalid option.");
        }
    }

    else if(server.getPrevState()==0 && server.getCurrState()==2){
        state = 2;
        System.out.println("Service is now provided by DEF company.");
    }

    else if(server.getPrevState()==1 && server.getCurrState()==0){
        state = 0;
    }

    else if(server.getPrevState()==1 && server.getCurrState()==2){
        if(state == 1){
            state = 2;
            System.out.println("All functionality has been shifted to DEF server.");
        }
    }

    else if(server.getPrevState() == 2 && server.getCurrState() == 0){
        state = 0;
    }

    else if(server.getPrevState() == 2 && server.getCurrState() == 1);

    else {
        System.out.println("Invalid state.");
    }

    display();
    }

    @Override
    public void display() {
        if(state == 1)
            System.out.println(name + " using partially ABC & DEF server both.");
        else if(state == 2)
            System.out.println(name + " using DEF server.");
        else
            System.out.println(name + " using ABC server.");
    }
}
