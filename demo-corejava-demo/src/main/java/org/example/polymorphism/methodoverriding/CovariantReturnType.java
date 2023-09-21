package org.example.polymorphism.methodoverriding;

class AA {}

class BB extends AA {}

class BaseE
{
    BB fun()
    {
        System.out.println("Base fun()");
        return new BB();
    }
}

class DerivedD extends BaseE
{
    ////AA fun()
    {
        System.out.println("Derived fun()");
        //return new AA();
    }
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BaseE base = new BaseE();
	       base.fun();

	       DerivedD derived = new DerivedD();
	       derived.fun();

	}

}
