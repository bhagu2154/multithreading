package multithreading;

public class Worker implements Runnable{
    @Override
    public void run() {

    }
    class Test{
        public static void main(String[] args) {
            Worker worker=new Worker();
            worker.start();
        }
    }

    void start() {
        System.out.println("worker");
    }
}
