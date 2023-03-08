public class BMW implements Car{
    //attribues for the car company BMW
    private String company = "BMW";
    private String country = "Germany";
    private String color = "Black";
    private String engine = "Electric";
    private String driveTrain = "Rear Wheels";

    @Override
    public void CompanyName() {
        System.out.println("Company: "+ company);
    }

    @Override
    public void ManufacturingCountry() {
        System.out.println("Manufacturing Country: "+ country);
    }

    @Override
    public void Color() {
        System.out.println("Color: "+ color);
    }

    @Override
    public void Engine() {
        System.out.println("Engine: "+ engine);
    }

    @Override
    public void DriveTrain() {
        System.out.println("Drive Train: "+driveTrain);
    }
}
