package org.example.designpattern.creational.builder;

public class BuilderTest {

    public static void main(String str[])
    {
        User user=new User.UserBuilder("hello","name").phone("1234").build();
    }
}
