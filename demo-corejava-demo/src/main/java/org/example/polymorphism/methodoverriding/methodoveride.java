package executerdemo.methodoveriding;

class Parent{
	String name="hello";
public void connect(){
System.out.println("Doing connection in Parent way"); 
}
}

class Child extends Parent {
	String name="hello1";
@Override
public void connect() { 
System.out.println("Doing connection in Child way");
}
}
public class methodoveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch=new Child();
		Parent pp=new Child();
		ch.connect();
		pp.connect();
		
		System.out.println(pp.name);

	}

}
