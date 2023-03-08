package COMPUTER;

public class ComputerB implements Computer{
    private int height;
    private int width;

    public ComputerB() {
        height = 350;
        width = 250;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
