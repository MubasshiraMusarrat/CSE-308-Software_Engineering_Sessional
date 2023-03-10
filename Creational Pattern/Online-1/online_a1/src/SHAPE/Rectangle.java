package SHAPE;

public class Rectangle implements Shape{
    private String name;
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSurfaceArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }
}
