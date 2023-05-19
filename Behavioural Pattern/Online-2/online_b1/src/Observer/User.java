package Observer;

import Server.WeatherApp;

public class User implements Observer{
    private WeatherApp weatherApp;
    private String weatherCondition;
    private double temperature;
    private boolean alert;

    public User(WeatherApp weatherApp){
        this.weatherApp = weatherApp;
        weatherApp.registerObserver(this);
        alert = false;
    }

    @Override
    public void update(String c, double t, boolean a) {
        weatherCondition = c;
        temperature = t;
        alert = a;
        display();
    }

    public void display(){
        System.out.println("Weather condition: "+weatherCondition);
        System.out.println("Temperature: "+temperature+" degree Celsius");
        if(alert){
            if(weatherCondition.equalsIgnoreCase("snowy")){
                System.out.println("Alert!");
                System.out.println("Possibility of heavy snow.");
            }
            else if(weatherCondition.equalsIgnoreCase("rainy")){
                System.out.println("Alert!");
                System.out.println("Possibility of heavy storm.");
            }
        }
    }
}
