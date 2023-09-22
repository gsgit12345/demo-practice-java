package org.example.designpattern.PrototypePattern;

import java.util.ArrayList;

public class UserDAO {
    ArrayList<User> users;
     
    public UserDAO() {
        users = new ArrayList();
        users.add(new User("Albert","albert@gmail.com"));
        users.add(new User("Bob","bob@gmail.com"));
        users.add(new User("Gary","gary@gmail.com"));
        users.add(new User("Geno","geno@gmail.com"));
        
        System.out.println("hello userservice constructor");
    }
    public ArrayList getUsers(){
    	System.out.println("hello userservice getuser");
        return users;
    }
}

/*
The above two classes present the base object class User that helps in creating the list of users. The second class created above is a service 
that would in a real world application help in fetching a list of users existing in the database. Currently it 
just mocks the service call and loads the data into list by creating it.

*/

