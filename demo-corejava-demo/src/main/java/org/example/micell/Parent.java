package org.example.micell;

class Parent{
	  
    public Parent(){
        name();
        normal();
    }
  
    private void name(){
        System.out.printf("private method inside Parent class in Java %n");
    }
  
    public void normal() throws NullPointerException{
        System.out.println("non private method from Parent class can be overridden");
    }
  
}

