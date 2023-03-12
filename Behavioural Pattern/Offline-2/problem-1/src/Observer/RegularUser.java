package Observer;

import Server.ABCServer;

import java.util.Scanner;

public class RegularUser implements Observer,DisplayElement{
    private ABCServer server;
    private String name;
    private int bill = 0;
    private int state; //similar to server
                        //shut down = -1

    public RegularUser(ABCServer abc, String s){
        this.server = abc;
        server.registerObserver(this);
        this.name = s;
        state = 0;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getType() { return "Regular User";}

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

        if(server.getPrevState()==0 && server.getCurrState()==1) {
            System.out.println("1. Use limited functionality.");
            System.out.println("2. Pay $20/hour to enjoy full functionality using server DEF");

            s = sc.nextLine();
            if(s.equalsIgnoreCase("1")){
                state = 1;
            }
            else if(s.equalsIgnoreCase("2")){
                state = 2;
                bill += (20*3);
            }
            else {
                System.out.println("Invalid option.");
            }
        }

        else if(server.getPrevState()==0 && server.getCurrState()==2){
            System.out.println("Do you want to pay $20/hour to take services from DEF server?Y or N");
            s=sc.nextLine();
            if(s.equalsIgnoreCase("Y")){
                state = 2;
                bill += (20*5);
            }
            else {
                state = -1;
            }
        }

        else if(server.getPrevState()==1 && server.getCurrState()==0){
            if(state == 2) {
                System.out.println(" Your bill: "+bill+" $");
            }
            bill = 0;
            state = 0;
        }

        else if(server.getPrevState()==1 && server.getCurrState()==2){
            if(state == 2) {
                System.out.println(" Your bill: "+bill+" $");
                bill = 0;
            }
           state = -1;
        }

        else if(server.getPrevState() == 2 && server.getCurrState() == 0){
            if(state == 2) {
                System.out.println(" Your bill: "+bill+" $");
            }
            bill = 0;
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
        if(state == -1){
            System.out.println(name + " currently out of service.");
        }
        else if(state == 1){
            System.out.println(name + " using limited functionality of server ABC.");
        }
        else if(state == 2){
            System.out.println(name + " using server DEF");
        }
        else {
            System.out.println(name + " using server ABC.");
        }
    }
}
