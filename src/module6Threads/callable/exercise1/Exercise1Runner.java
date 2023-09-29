package module6Threads.callable.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;

public class Exercise1Runner {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        HashSet<Future<List<String>>> futures = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<List<String>> future = pool.submit(new FileGenerator(i));
            futures.add(future);
        }

        for (Future<List<String>> future : futures) {
            try {
                result.addAll(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.close();
        System.out.println(result);

    }
}
