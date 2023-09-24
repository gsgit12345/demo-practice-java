package org.example.multithread.lock;

class mylockObj implements Runnable
{
public Object lock=new Object();
    @Override
    public void run() {
        lockObject();
    }
    public void lockObject()
    {
        System.out.println(" before lock Thread is "+Thread.currentThread().getName());
        synchronized (this)
        {
            System.out.println("Thread is "+Thread.currentThread().getName());
        }
    }
    public synchronized  void secondWay()
    {
        System.out.println("Thread is secondway "+Thread.currentThread().getName());
    }
    public   void thirdWay()
    {
        synchronized (lock)
        {
            System.out.println("Thread is thirdway "+Thread.currentThread().getName());
        }
    }

}
public class ObjectLevelLock {
    public static void main(String string[])
    {
        mylockObj t1Ob=new mylockObj();
        Thread t1=new Thread(t1Ob);
        Thread t2=new Thread(t1Ob);
        Thread t3=new Thread(t1Ob);
        t1.setName("firstthread");
        t2.setName("secondthread");
        t3.setName("thirdthread");
        t1.start();
        t2.start();
        t3.start();
    }
}
