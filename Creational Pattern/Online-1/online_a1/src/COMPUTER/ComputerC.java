package COMPUTER;

public class ComputerC implements Computer{
    private final int height;
    private final int width;

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

    @Override
    public void CPU() {
        System.out.println("CPU-C");
    }

    @Override
    public void MMU() {
        System.out.println("MMU-C");
    }
}
