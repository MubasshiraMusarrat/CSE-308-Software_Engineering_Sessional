//factory method to get object of type car
public class CarFactory {
    public Car getCompany( String region){
        //return no object
        if(region == null) {
            return null;
        }
        //returning an instance of Toyota
        else if( region.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        //returning an instance of BMW
        else if( region.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        //returning an instance of Tesla
        else if( region.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        //default value if no case occurs
        return null;
    }
}
