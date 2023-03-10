package COMPUTER;

public class ComputerB implements Computer{
    private final int height;
    private final int width;

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

    @Override
    public void CPU() {
        System.out.println("CPU-B");
    }

    @Override
    public void MMU() {
        System.out.println("MMU-B");
    }
}
