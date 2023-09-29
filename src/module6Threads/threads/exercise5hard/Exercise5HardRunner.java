package module6Threads.threads.exercise5hard;

public class Exercise5HardRunner {
    public static void main(String[] args) {
        StoreQueue sq = new StoreQueue();
        Producer p1 = new Producer(sq);
        Producer p2 = new Producer(sq);
        Producer p3 = new Producer(sq);
        Consumer c1 = new Consumer(sq);
        Consumer c2 = new Consumer(sq);
        new Thread(p1, "Thread_p1").start();
        new Thread(p2, "Thread_p2").start();
        new Thread(p3, "Thread_p3").start();
        new Thread(c1, "Thread_c1").start();
        new Thread(c2, "Thread_c2").start();


    }
}
