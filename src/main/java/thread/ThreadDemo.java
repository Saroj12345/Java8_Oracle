package thread;

public class ThreadDemo {

    public static void main(String[] args) {

      Thread t1 = new Thread(new MyThread());
      Thread t2 = new Thread(new MyThread());
      t1.start();
      //t2.start();

    }
}
class MyThread implements    Runnable {

    int count=1;
    @Override
    public void run() {
        for(int i=1;i<100;i++) {
            System.out.println("Hello My Value is "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}