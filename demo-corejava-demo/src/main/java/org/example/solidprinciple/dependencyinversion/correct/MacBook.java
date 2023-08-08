package org.example.solidprinciple.dependencyinversion.correct;

import org.example.solidprinciple.dependencyinversion.incorrect.WiredKeyBoard;
import org.example.solidprinciple.dependencyinversion.incorrect.WiredMouse;

public class MacBook {
    public KeyBoard wiredKeyBoard;
    public Mouse wiredMouse;

    public MacBook(KeyBoard wiredKeyBoard,Mouse wiredMouse)
    {
        this.wiredKeyBoard=wiredKeyBoard;
        this.wiredMouse=wiredMouse;

        //here it is ok as per dependency inversion principle.
    }
}
