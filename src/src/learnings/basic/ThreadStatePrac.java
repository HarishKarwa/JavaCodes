package learnings.basic;

public class ThreadStatePrac extends Thread{
    public static void main(String[] args) {
        ThreadStatePrac thread = new ThreadStatePrac();

        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        try {
            thread.join();
            System.out.println(thread.getState());
        } catch(Exception e) {
            System.out.println("exception");
        }
    }
}
