package learnings.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable worker = new RunnableInterface();
        executorService.execute(worker);
        executorService.shutdown();

        RunnableInterface runnableInterface = new RunnableInterface();
        RunnableInterface two = new RunnableInterface();
        Thread thread = new Thread(runnableInterface, "t1");
        Thread threadTwo = new Thread(two);
        thread.setDaemon(true);
        threadTwo.setPriority(1);
        thread.start();
        threadTwo.start();

    }
}
