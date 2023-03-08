package COMPUTER;

public class ComputerC implements Computer{
    private int height;
    private int width;

    public  ComputerC() {
        height = 550;
        width = 430;
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
