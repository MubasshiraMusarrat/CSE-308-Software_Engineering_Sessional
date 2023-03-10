package COMPUTER;


public class ComputerA implements Computer {
    private final int height;
    private final int width;

    public  ComputerA() {
        height = 200;
        width = 200;
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
        System.out.println("CPU-A");
    }

    @Override
    public void MMU() {
        System.out.println("MMU-A");
    }

}
