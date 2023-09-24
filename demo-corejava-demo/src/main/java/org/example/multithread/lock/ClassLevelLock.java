package org.example.multithread.lock;
class LockOnClass implements Runnable
{
private static Object lock=new Object();
    @Override
    public void run() {

    }
    //this is the first way to implement the class level lock
    public static synchronized  void method()
    {
        System.out.println("thread executing is:"+Thread.currentThread().getName());
    }
    //this is second way aquiring the lock on class
    public void secondWay()
    {
        synchronized (LockOnClass.class)
        {
            System.out.println("thread aquiring lock second way is:"+Thread.currentThread().getName());
        }
    }
    public void thirdWay()
    {
        synchronized (lock)
        {
            System.out.println("thread aquiring lock third way is:"+Thread.currentThread().getName());

        }
    }

}

public class ClassLevelLock {
}
