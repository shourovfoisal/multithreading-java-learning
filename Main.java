
class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i=0; i<2500; i++) {
            System.out.println("Thread 1 is running.");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i=0; i<2500; i++) {
            System.out.println("Thread 2 is running.");
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<2500; i++) {
            System.out.println("Thread 3 is running.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        Runnable t4 = () -> {
            for(int i=0; i<2500; i++) {
                System.out.println("Thread 4 is running.");
            }
        };


        t1.start();
        t2.start();
        t3.run();
    }
}
