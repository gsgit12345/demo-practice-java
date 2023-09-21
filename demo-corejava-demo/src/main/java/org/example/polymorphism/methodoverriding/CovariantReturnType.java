package Stringquestion;

class A {}

class B extends A {}

class Base
{
    B fun()
    {
        System.out.println("Base fun()");
        return new B();
    }
}

class Derived extends Base
{
    A fun()
    {
        System.out.println("Derived fun()");
        return new A();
    }
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Base base = new Base();
	       base.fun();

	       Derived derived = new Derived();
	       derived.fun();

	}

}
