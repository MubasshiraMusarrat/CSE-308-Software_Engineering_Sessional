package SHAPE;

public class Square implements Shape{
    private String name;
    private double length;

    public Square(double length){
        this.length = length;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSurfaceArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
}
