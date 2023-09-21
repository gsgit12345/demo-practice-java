package executerdemo.Thread;


 class PrintSequenceRunnable implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=new Object();
 
    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
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
 

public class PrintThreadsSequentiallyMain {
	 
    public static void main(String[] args) {
 
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");
 
        t1.start();
        t2.start();
        t3.start();   
    }
}

/*
1 --t1
2---t2
3--t3
4--t1
5--t2
6---t3

up to max

https://java2blog.com/print-sequence-3-threads-java/

If number%3==1 then T1 will print the number and increment it else will go in the wait state.
If number%3==2 then T2 will print the number and increment it else will go in the wait state.
If number%3==0 then T3 will print the number and increment it else will go in the wait state.


*/