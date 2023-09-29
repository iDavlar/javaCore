package module6Threads.callable.exercise3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

public class HelloWorldWriter implements Callable<Boolean> {

    private final static String FILE_PATH = "C:\\JPr\\javaCore\\src\\module6Threads\\callable";
    private final static String FILE_NAME = "HW.txt";
    private final static String STR = "Hello World";
    private File file;
    private int id;

    public HelloWorldWriter(File file, int id) {
        this.file = file;
        this.id = id;
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Boolean>> futures = new HashSet<>();
        File file = new File(FILE_PATH, FILE_NAME);

        if (file.exists()) {
            file.delete();
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10; i++) {
            Future<Boolean> future = pool.submit(new HelloWorldWriter(file, i));
            futures.add(future);
        }

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

        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            System.out.println("File:\n" + new String(bis.readAllBytes(), StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Boolean call() throws Exception {
        Random random = new Random();

        synchronized (this.file) {
            System.out.println(Thread.currentThread().getName() + " - id: " + id + " is working...");
            String text = id + ": "
                    + STR
                    + LocalTime.now().format(DateTimeFormatter.ofPattern(" - HH:mm:ss \n"));
            try (FileOutputStream fos = new FileOutputStream(this.file, true);
                 BufferedOutputStream bos = new BufferedOutputStream(fos)) {
                bos.write(text.getBytes(StandardCharsets.UTF_8));
                bos.flush();
            }
        }

        Thread.sleep(random.nextInt(3000));

        return true;
    }
}
