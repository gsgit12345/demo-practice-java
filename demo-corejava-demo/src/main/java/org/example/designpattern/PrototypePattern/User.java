package org.example.designpattern.PrototypePattern;
public class User {
    String name;
    String email;
     
    public User(String name,String email) {
        this.name= name;
        this.email = email;
    }
     
    public String toString() {
        return "Name of user:"+this.name+"\nEmail of User:"+this.email;
    }
}

/*
However, with the Prototype design pattern, we would understand how the overhead of fetching or creating the data is eliminated. 
Create the Java classes as shown below.

*/

