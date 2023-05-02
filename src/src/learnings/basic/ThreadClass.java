package learnings.basic;

//After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown.
public class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);//time cannot be negative
                System.out.println(i + " " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred");
            }
        }
    }

    //public ThreadClass() {
       // super("MyThread");
    //}

    public static void main(String args[]) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.setName("One");
        ThreadClass thread = new ThreadClass();
        thread.setName("two");
        threadClass.start();
        try {
            threadClass.join();
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred");
        }
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred");
        }
    }
}
