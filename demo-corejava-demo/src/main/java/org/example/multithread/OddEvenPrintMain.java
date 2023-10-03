package executerdemo.Thread;

public class OddEvenPrintMain {
	 
    boolean odd;
    int count = 1;
    int MAX = 20;
 
    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");
 
                while (!odd) {
                    try {
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }
 
    public void printEven() {
 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking even loop");
 
                while (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();
 
            }
        }
    }
 
    public static void main(String[] args) {
 
        OddEvenPrintMain oep = new OddEvenPrintMain();
        oep.odd = true;
        Thread t1 = new Thread(new Runnable() {
 
            @Override
            public void run() {
                oep.printEven();
 
            }
        });
        Thread t2 = new Thread(new Runnable() {
 
            @Override
            public void run() {
                oep.printOdd();
 
            }
        });
 
        t1.start();
        t2.start();
 
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
    }
}

/* Use a variable called boolean odd. If you want to print odd number, its value should be true and vice versa for even number.
Create two methods printOdd() and printEven(), one will print odd numbers and other will print even numbers.
Create two threads, t2 for odd and t1 for even.
t1 will call printEven() method and t2 will call printOdd() method simultaneously.
If boolean odd is true in printEven() method, t1 will wait.
If boolean odd is false in printOdd() method, t2 will wait.
 */
 
