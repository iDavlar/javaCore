package module6Threads.callable.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise2Runner {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<Integer>>> futures = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            NumberGenerator ng = new NumberGenerator(i);
            Future<List<Integer>> future = pool.submit(ng);
            futures.add(future);
        }

        int sum = 0;
        for (Future<List<Integer>> future : futures) {
            try {
                List<Integer> list = future.get();
                for (Integer i : list) {
                    sum += i;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }

        }
        pool.close();
        System.out.println("Sum of elements is " + sum);
    }
}
