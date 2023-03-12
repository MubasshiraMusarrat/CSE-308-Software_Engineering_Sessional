import Observer.User;
import Server.WeatherApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        User user1 = new User(weatherApp);

        Scanner sc = new Scanner(System.in);
        String s;

        while(true){
            System.out.println("Change weather condition or Press C or Q to exit.");
            s=sc.nextLine();
            if(s.equalsIgnoreCase("q"))
                break;
            else {
                System.out.println("Weather condition: ");
                System.out.println("1. Sunny");
                System.out.println("2. Rainy");
                System.out.println("3. Snowy");
                String w = sc.nextLine();
                if(w.equalsIgnoreCase("1"))
                    w = "Sunny";
                else if(w.equalsIgnoreCase("2"))
                    w = "Rainy";
                else if(w.equalsIgnoreCase("3"))
                    w = "Snowy";
                else{
                    System.out.println("Invalid choice");
                    continue;
                }

                System.out.println("Temperature: ");
                String t = sc.nextLine();
                double temp = Double.parseDouble(t);

                System.out.println("Alert: y or n");
                String a = sc.nextLine();
                boolean al;
                if(a.equalsIgnoreCase("y"))
                    al=true;
                else
                    al = false;
                weatherApp.setWeatherCondition(w,temp,al);
            }
        }
    }
}
