package module9Exam.exercise4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import module7StreamAPI.json.exercise2.ColourPiсker;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

@AllArgsConstructor
public class PlayerReaderTask implements Callable<List<Player>> {
    private File file;
    private Predicate<Player> playerFilter;

    @Override
    public List<Player> call() throws Exception {
        return readFile();
    }

    private List<Player> readFile() {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] json = fis.readAllBytes();
            ObjectMapper mapper = new ObjectMapper();
            return mapper
                    .readValue(json, new TypeReference<List<Player>>() {

                    })
                    .stream()
                    .filter(this.playerFilter)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
