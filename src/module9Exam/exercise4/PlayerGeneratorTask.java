package module9Exam.exercise4;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

import java.io.*;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

@AllArgsConstructor
public class PlayerGeneratorTask implements Callable<File> {
    private static final File DIR = new File("C:\\JPr\\javaCore\\src\\module9Exam");
    private static final String[] NAMES = {"Davlar", "stray", "smurf", "arumi", "big boss", "PRO100Slav"};
    private static final int MAX_AGE = 40;
    private static final int MIN_AGE = 20;

    private int id;
    private int number;


    @Override
    public File call() throws Exception {
        File file = createFile();
        saveToFile(
                file,
                generatePlayers()
        );
        return file;
    }

    private void saveToFile(File file, List<Player> players) {
        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            ObjectMapper mapper = new ObjectMapper();

            for (Player player : players) {
                mapper.writeValue(bos, players);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private File createFile() {
        File file = new File(
                DIR,
                String.format("%s_%d_Players.json",
                        Thread.currentThread().getName(),
                        this.id)
        );

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return file;
    }

    private List<Player> generatePlayers() {
        List<Player> players = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < this.number; i++) {
            players.add(new Player(
                    NAMES[r.nextInt(NAMES.length)],
                    r.nextInt(MIN_AGE, MAX_AGE + 1),
                    r.nextBoolean()
            ));
        }

        return players;
    }

}
