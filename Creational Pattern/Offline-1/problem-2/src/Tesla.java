public class Tesla implements Car{
    //attribues for the car company Tesla
    private String company = "Tesla";
    private String country = "United States";
    private String color = "White";
    private String engine = "Electric";
    private String driveTrain = "All Wheels";

    @Override
    public void CompanyName() {
        System.out.println("Company: "+company);
    }

    @Override
    public void ManufacturingCountry() {
        System.out.println("Manufacturing Country: "+ country);
    }

    @Override
    public void Color() {
        System.out.println("Color: "+color);
    }

    @Override
    public void Engine() {
        System.out.println("Engine: "+engine);
    }

    @Override
    public void DriveTrain() {
        System.out.println("Drive Train: "+driveTrain);
    }
}
