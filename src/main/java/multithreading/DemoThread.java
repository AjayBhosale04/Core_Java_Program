package multithreading;

public class DemoThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread1"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        DemoThread t1=new DemoThread();
        new Thread(t1).start();


    }
}
