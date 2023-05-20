package Abstraction;

import Implementation.OS;

public class Notebook extends Device{

    public Notebook(OS os) {
        super(os, "Notebook");
    }
}