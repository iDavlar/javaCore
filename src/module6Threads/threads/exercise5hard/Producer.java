package module6Threads.threads.exercise5hard;

import java.util.Random;

public class Producer implements Runnable {

    private StoreQueue queue;

    public Producer(StoreQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (this.queue.checkElementsCount()) {
            this.queue.put(random.nextInt(100) + 1);
        }
    }
}
