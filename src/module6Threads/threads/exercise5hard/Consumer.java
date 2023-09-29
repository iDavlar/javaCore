package module6Threads.threads.exercise5hard;

public class Consumer implements Runnable {
    private StoreQueue queue;

    public Consumer(StoreQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (this.queue.checkElementsCount()) {
            this.queue.get();
        }
    }
}
