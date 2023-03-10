package SHAPE;

public class Circle implements Shape{
    private String name;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSurfaceArea() {
        return 3.1416*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.1416*radius;
    }
}
