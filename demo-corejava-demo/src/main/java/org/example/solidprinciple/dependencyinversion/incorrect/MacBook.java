package org.example.solidprinciple.dependencyinversion.incorrect;

public class MacBook {
    public WiredKeyBoard wiredKeyBoard;
    public WiredMouse wiredMouse;

    public MacBook()
    {
        wiredKeyBoard=new WiredKeyBoard();
        wiredMouse=new WiredMouse();

        //here creating new class and assigining it. it should not be as per dependency inversion principle;
    }
}
