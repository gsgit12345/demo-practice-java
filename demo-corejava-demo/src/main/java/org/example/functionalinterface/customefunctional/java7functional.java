package org.example.functionalinterface.customefunctional;

public class java7functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();

	}

}
