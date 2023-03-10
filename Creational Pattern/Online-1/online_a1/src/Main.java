import COMPUTER.Computer;
import SHAPE.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String computerName;
        String shapeName;
        double a,b=0;
        ComputerFactory computerFactory = new ComputerFactory();
        ShapeFactory shapeFactory = new ShapeFactory();

        System.out.println("Enter Computer Name:");
        Scanner sc = new Scanner(System.in);
        computerName=sc.nextLine();
        Computer computer = computerFactory.getComputer(computerName);

        System.out.println("Enter Shape Name: ");
        shapeName = sc.nextLine();
        System.out.println("Enter Parameter:");
        a = sc.nextDouble();
        if(shapeName.equalsIgnoreCase("Rectangle")){
            System.out.println("Enter Parameter:");
             b = sc.nextDouble();
        }
            Shape shape = shapeFactory.getShape(shapeName,a,b);

        if(shape.getSurfaceArea() > (computer.getHeight() * computer.getWidth())) {
            System.out.println("Can not load");
        }
        else{
            System.out.println(shape.getName());
            System.out.println("Resolution: "+computer.getHeight()+"x"+ computer.getWidth());
            System.out.println("Surface area: "+shape.getSurfaceArea());
            System.out.println("Perimeter: "+shape.getPerimeter());
        }
    }
}
