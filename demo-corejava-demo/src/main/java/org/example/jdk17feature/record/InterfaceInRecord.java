package org.example.jdk17feature.record;

public record InterfaceInRecord (String name,HelloInterface hello){

    public interface HelloInterface{
        int getAge();
    }
}
