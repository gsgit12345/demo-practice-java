package org.example.defaultmethod;
public class FieldShadowingExample{
	   String name = "Krishna";
	   int age = 25;
	   public void display(){
	      String name = "Vishnu";
	      int age = 22;
	      System.out.println("Name: "+name);
	      System.out.println("age: "+age);
	   }
	   public static void main(String args[]){
	      new FieldShadowingExample().display();
	   }
	}
