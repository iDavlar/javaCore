package module6Threads.threads.exercise1;

import java.util.Random;

public class MyFirstThread implements Runnable {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Thread thread = new Thread(new MyFirstThread(), "Thread_" + i);
            thread.start();
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        int[] numbers = new int[10];
        int i = 0;
        int max;

        numbers[i] = random.nextInt(1000);
        max = numbers[i++];
        for (int j = i; j < numbers.length; j++) {
            numbers[j] = random.nextInt(1000);
            if (max < numbers[j]) {
                max = numbers[j];
            }
        }

        System.out.println(Thread.currentThread().getName() + " - " + max);

    }
}
