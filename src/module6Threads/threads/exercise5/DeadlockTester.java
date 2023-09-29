package module6Threads.threads.exercise5;

import module6Threads.threads.exercise2.FileMaker;

public class DeadlockTester implements Runnable {
    private DeadlockMaker theReason;

    private int id;

    public DeadlockTester(DeadlockMaker theReason, int id) {
        this.theReason = theReason;
        this.id = id;
    }

    public static void main(String[] args) {
        DeadlockMaker dm = new DeadlockMaker();
        for (int i = 1; i < 4; i++) {
            Thread thread = new Thread(new DeadlockTester(dm, i), "Thread_" + i);
            thread.start();
        }
    }

    @Override
    public void run() {
        synchronized (this.theReason) {
            try {
                if (this.theReason.getField() == this.id) {
                    System.out.println(Thread.currentThread().getName() + " notify!");
                    this.theReason.notify();
                } else {
                    System.out.println(Thread.currentThread().getName() + " wait!");
                    this.theReason.wait();
                }
                this.theReason.setField(this.id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
