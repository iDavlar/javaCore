package module6Threads.callable.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


public class NumberGenerator implements Callable<List<Integer>> {

    private int id;

    public NumberGenerator(int id) {
        this.id = id;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        String threadName = Thread.currentThread().getName() + " #" + id;

        System.out.println(threadName + ": is working");
        for (int i = 0; i < 10; i++) {
            result.add(random.nextInt(1000));
        }
        Thread.sleep(random.nextInt(10_000));

        return result;
    }
}
