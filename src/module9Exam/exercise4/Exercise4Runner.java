package module9Exam.exercise4;


import java.io.File;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise4Runner {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Set<Future<File>> futuresFiles = new HashSet<>();
        Set<Future<List<Player>>> futuresPlayers = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            Future<File> future = pool.submit(new PlayerGeneratorTask(i, 10));
            futuresFiles.add(future);
        }

        List<File> files = new ArrayList<>();
        for (Future<File> future : futuresFiles) {
            try {
                files.add(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        for (File file : files) {
            Future<List<Player>> future = pool.submit(
                    new PlayerReaderTask(
                            file,
                            p -> p.getAge() >= 25 && p.getAge() <= 30
                    ));
            futuresPlayers.add(future);
        }

        List<Player> players = new ArrayList<>();
        for (Future<List<Player>> future : futuresPlayers) {
            try {
                players.addAll(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        players.stream()
                .sorted(Comparator.comparing(Player::getAge))
                .limit(5)
                .forEach(System.out::println);

        pool.close();
    }
}
