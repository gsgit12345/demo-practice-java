package org.example.designpattern.PrototypePattern;

import java.util.List;

public class PrototypeDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService users = new UserService();
        users.getUsers();
        
      //  System.out.println(users.toString());
 
        // Use the clone method to get the Employee object
        UserService usersNew;
        try {
            usersNew = (UserService) users.clone();
            UserService usersNew1 = (UserService) users.clone();
            List list = usersNew.getUsersList();
            list.add(new User("Tim", "tim@gmail.com"));
            List list1 = usersNew1.getUsersList();
            list1.remove(new User("steve", "steve@gmail.com"));
 
            System.out.println("users List: " + users.getUsersList());
            System.out.println("usersNew List: " + list);
            System.out.println("usersNew1 List: " + list1);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


	}

}

/*
 
 As it can be seen, the object clones contain the data separately. Each cloned object instance has the data from the actual object along 
 with the new data that is being added to it. In this manner, the object prototypes can be created without calling the service again.
 
 */


