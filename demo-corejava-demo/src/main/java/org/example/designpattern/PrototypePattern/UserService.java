package org.example.designpattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Cloneable{
    private ArrayList<User> userList;
    
    public UserService() {
        this.userList=new ArrayList<>();
    }
     
    public UserService(ArrayList users) {
        this.userList = users;
    }
     
    public void getUsers() {
    	UserDAO s = new UserDAO();
        this.userList = s.getUsers();
    }
     
    public ArrayList<User> getUsersList(){
        return userList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
            List temp = new ArrayList();
            for(User s : this.getUsersList()){
                temp.add(s);
            }
            System.out.println("in user service method clone");
            return new UserService((ArrayList) temp);
    }


}

/*
 As it can be seen, the class provides a function clone(). This function will be further used to obtain cloned objects. 
 This function uses the existing list of users and creates a new list out of it. It does not go for a service call as it can be noted. 
 This ensures that the application does not hit the database repeatedly and all the objects have the required data with just one hit.
 This saves the overhead of database calls and results in extremely good performance thereafter.
 */

