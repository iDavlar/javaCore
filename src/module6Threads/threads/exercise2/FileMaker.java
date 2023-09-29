package module6Threads.threads.exercise2;

import module6Threads.threads.exercise1.MyFirstThread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileMaker implements Runnable {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new FileMaker(), "Thread_" + i);
            thread.start();
        }
    }

    @Override
    public void run() {
        Random random = new Random();
        int[] numbers = new int[10];
        String threadName = Thread.currentThread().getName();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        File file = new File(
                "C:\\JPr\\javaCore\\src\\module6Threads\\threads",
                threadName + ".txt"
        );
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            for (int i : numbers) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
            System.out.println("File has been created by " + threadName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
