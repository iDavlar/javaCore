package module6Threads.threads.exercise5hard;

import java.util.LinkedList;

public class StoreQueue {
    private LinkedList<Integer> queue = new LinkedList<>();
    private int elementsCount = 0;

    public synchronized boolean checkElementsCount() {
        return elementsCount < 10_000;
    }

    public synchronized void get() {
        if (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (!this.checkElementsCount()) {
            notify();
            return;
        }
        Integer item = queue.pollFirst();
        elementsCount++;
        System.out.println(elementsCount + ": Get " + item.toString());
        if (queue.size() <= 80 || !this.checkElementsCount()) {
            notify();
        }
    }

    public synchronized void put(Integer value) {
        if (queue.size() >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (!this.checkElementsCount()) {
            notify();
            return;
        }
        queue.add(value);

        System.out.println(elementsCount + ":Put " + value.toString());
        notify();
    }

}
