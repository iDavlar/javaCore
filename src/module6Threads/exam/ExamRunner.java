package module6Threads.exam;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExamRunner {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        EventMap eventMap = new EventMap();
        Future<Boolean>[] futures = new Future[3];

        eventMap.put(new Event(
                "Event 1",
                LocalDateTime.now().plusSeconds(15),
                "description",
                false
        ));

        eventMap.put(new Event(
                "Event 2",
                LocalDateTime.now().plusSeconds(60),
                "description",
                false
        ));

        futures[0] = pool.submit(new OneHourBeforeEventNotifier(eventMap));
        futures[1] = pool.submit(new EventBeginningNotifier(eventMap));
        futures[2] = pool.submit(new EventStartedNotifier(eventMap));

        for (Future<Boolean> future : futures) {
            try {
                future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        pool.close();

        System.out.println("Done");
    }
}
