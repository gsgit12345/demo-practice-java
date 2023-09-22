package org.example.customecollectionclass.sorting;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
	}

}
