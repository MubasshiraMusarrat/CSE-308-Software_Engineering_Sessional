package Abstraction;

import Implementation.OS;

public abstract class Device {
    private OS os;
    private String name;
    Device(OS os, String name){
        this.os = os;
        this.name = name;
    }

    public void storageModule(){
        System.out.print(name+" ");
        os.storageModule();
    }
    public void interfaceModule(){
        System.out.print(name+" ");
        os.InterfaceModule();
    }
    public void communicationModule(){
        System.out.print(name+" ");
        os.CommunicationModule();
    }
}
