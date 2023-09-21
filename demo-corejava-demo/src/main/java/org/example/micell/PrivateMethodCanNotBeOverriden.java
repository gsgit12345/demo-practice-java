package org.example.micell;

public class PrivateMethodCanNotBeOverriden{
	  
    public static void main(String args[]) {
        //shows that private method can not be overridden in Java     
        Parent parent = new Child();
      parent.normal();
    }
  
  
}

