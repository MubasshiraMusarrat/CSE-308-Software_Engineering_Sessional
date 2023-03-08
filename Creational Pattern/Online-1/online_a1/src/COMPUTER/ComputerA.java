package COMPUTER;

import COMPUTER.Computer;

public class ComputerA implements Computer {
    private int height;
    private int width;

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

}
