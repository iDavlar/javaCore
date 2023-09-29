package module6Threads.threads.exercise4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class Sleeper extends Thread {


    public Sleeper(String name) {
        super(name);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Thread thread = new Sleeper("Thread_" + i);
            System.out.println(thread.getName() + " start at "
                    + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        System.out.println("I am " + this.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
