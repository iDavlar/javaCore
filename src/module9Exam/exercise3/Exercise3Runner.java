package module9Exam.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise3Runner {
    public static void main(String[] args) {
        List<Car> cars = CarGenerator.generateCars(10);
        Map<Integer, List<Car>> capacity = new HashMap<>();
        cars.forEach(car -> {
                    List<Car> list = capacity.getOrDefault(car.getEngineCapacity(), new ArrayList<>());
                    list.add(car);
                    capacity.put(car.getEngineCapacity(), list);
                }
        );
        saveToFile(capacity);
    }

    private static void saveToFile(Map<Integer, List<Car>> capacity) {
        File file = new File("Exam_3.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (Map.Entry<Integer, List<Car>> entry : capacity.entrySet()) {
                bw.write(entry.getKey().toString() + ":" + entry.getValue().toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
