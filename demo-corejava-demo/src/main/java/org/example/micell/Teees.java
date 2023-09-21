package org.example.micell;
class Test11 {
    Test11(int x) {
        System.out.println("Constructor called " + x); 
    } 
} 
public class Teees {
	Test11 t1 = new Test11(10);
	   
	Teees(int i) { t1 = new Test11(i); }
   
    public static void main(String[] args) {     
    	Teees t2 = new Teees(5); 
    } 
}
