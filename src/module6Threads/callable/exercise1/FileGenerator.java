package module6Threads.callable.exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<List<String>> {


    private static final String FILES_DIR = "C:\\JPr\\javaCore\\src\\module6Threads\\callable";

    private int id;

    public FileGenerator(int id) {
        this.id = id;
    }

    @Override
    public List<String> call() throws Exception {
        Random random = new Random();
        List<String> result = new ArrayList<>();
        String threadName = Thread.currentThread().getName() + "_id_" + id + "___";

        for (int i = 0; i < 10; i++) {
            File curFile = new File(FILES_DIR, threadName + "_" + i + ".txt");

            try (FileWriter fw = new FileWriter(curFile);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                for (int j = 0; j < 10; j++) {
                    bw.write("Line " + j);
                    bw.newLine();
                }
                bw.flush();
            }
            System.out.println(threadName + " add file: " + curFile.getName());
            result.add(curFile.getName());
        }

        Thread.sleep(random.nextInt(2000) + 1);

        return result;
    }
}
