package executerdemo.Thread;

class PrintOddEven implements Runnable{
	 
    public int MAX_NUMBER =10;
    static int  number=1;
    int rem;
    static Object lock=new Object();
 
    PrintOddEven(int remainder)
    {
        this.rem =remainder;
    }
 
    @Override
    public void run() {
        while (number < MAX_NUMBER) {
            synchronized (lock) {
                while (number % 2 != rem) { // wait
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
public class OddEvenMain {
    public static void main(String[] args) {
 
        PrintOddEven oddRunnable=new PrintOddEven(1);
        PrintOddEven evenRunnable=new PrintOddEven(0);
 
        Thread t1=new Thread(oddRunnable,"T1");
        Thread t2=new Thread(evenRunnable,"T2");
 
        t1.start();
        t2.start();
 
    }
}
