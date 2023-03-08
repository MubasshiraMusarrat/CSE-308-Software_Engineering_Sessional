import java.util.*;

public class Client {
    public static void main(String[] args) {
        //creating a car factory object to call to car classes
        CarFactory carFactory = new CarFactory();

        System.out.println("Enter the name of your region: Asia, Europe or United States"); //initiating input
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        String str= sc.nextLine();              //reads string

        //get an object of the car class according to the input region
        Car car = carFactory.getCompany(str);
        if(car == null)
            System.out.println("Enter a valid region: Asia, Europe or United States"); //invalid input
        else {
            //calling the functions of the car class
            System.out.println("You have chosen the region: "+str);
            car.CompanyName();
            car.ManufacturingCountry();
            car.Color();
            car.Engine();
            car.DriveTrain();
        }
    }
}
