package Server;

import Observer.Observer;

import java.util.ArrayList;

public class WeatherApp implements Subject{
    private ArrayList<Observer> observers;
    private String weatherCondition;
    private double temperature;
    private boolean alert;

    public WeatherApp(){
        observers = new ArrayList<Observer>();
        weatherCondition = "Sunny";
        temperature = 30;
        alert = false;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer o = observers.get(i);
            o.update(weatherCondition,temperature,alert);
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

    public void weatherChanged(){
        notifyObservers();
    }

    public void setWeatherCondition(String c, double t, boolean a){
        weatherCondition = c;
        temperature = t;
        alert = a;
        weatherChanged();
    }

}
