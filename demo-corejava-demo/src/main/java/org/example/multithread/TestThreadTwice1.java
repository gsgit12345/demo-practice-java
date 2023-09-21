package executerdemo.Thread;

public class TestThreadTwice1 extends Thread{   
public void run(){   
System.out.println(" thread is executing now........");   
}   
public static void main(String args[]){   
TestThreadTwice1 t1=new TestThreadTwice1();   
t1.start();   
t1.start();   
}   
}   
