package Server;

import Observer.*;

import java.util.ArrayList;

public class ABCServer implements Subject, DisplayElement {
    private ArrayList<Observer> observers;
    private int prevState;// operational = 0, partially down = 1, fully down= 2
    private int currState;

    public ABCServer(){
        observers = new ArrayList<Observer>();
        prevState = 0;
        currState = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer o = observers.get(i);
            o.update();
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
        else
            System.out.println("No such observer.");
    }

    public void stateChanged(){
        notifyObservers();
    }

    public void setState(int state){
        prevState = currState;
        currState = state;
        display();
        stateChanged();
    }


    public int getPrevState() { return prevState;}
    public int getCurrState() { return currState;}

    @Override
    public void display() {
        if(currState == 2){
            System.out.println("ABC server fully down.");
        }
        else if( currState == 1){
            System.out.println("ABC server partially down");
        }
        else if(currState == 0){
            if(prevState == 2 || prevState ==1){
                System.out.println("ABC server has resumed functionality");
            }
            else {
                System.out.println("ABC server is operational");
            }
        }
        else {
            System.out.println("Invalid state.");
        }
    }
}
