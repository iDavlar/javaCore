package module6Threads.threads.exercise3;

import module6Threads.threads.exercise1.MyFirstThread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Generator extends Thread {

    private ArrayList<Integer> arrayList;
    private int itemsToAdd;

    public Generator(String name, ArrayList<Integer> arrayList, int itemsToAdd) {
        super(name);
        this.arrayList = arrayList;
        this.itemsToAdd = itemsToAdd;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Thread thread = new Generator("Thread_" + i, arrayList, 25);
            thread.start();
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < itemsToAdd; i++) {
            int item = random.nextInt();
            synchronized (this.arrayList) {
                this.arrayList.add(item);
            }
            System.out.println(this.getName() + ": I add " + i + ": " + item + " and get tired. I am going to sleep");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.getName() + ": I am done. Items in the array: " + this.arrayList.size());
    }
}
