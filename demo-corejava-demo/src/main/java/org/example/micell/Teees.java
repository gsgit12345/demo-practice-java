package output;
class Test1 {    
    Test1(int x) { 
        System.out.println("Constructor called " + x); 
    } 
} 
public class Teees {
	Test1 t1 = new Test1(10);    
	   
	Teees(int i) { t1 = new Test1(i); }  
   
    public static void main(String[] args) {     
    	Teees t2 = new Teees(5); 
    } 
}
