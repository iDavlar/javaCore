package module9Exam.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarGenerator {
    private static final String[] NAMES = {"Toyota", "Nissan", "Ford", "HAMMER"};

    public static List<Car> generateCars(int number) {
        Random random = new Random();
        List<Car> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            result.add(new Car(
                            NAMES[random.nextInt(NAMES.length)],
                            CarModel.values()[random.nextInt(CarModel.values().length)],
                            random.nextInt(Car.MIN_ENGINE_CAPACITY, Car.MAX_ENGINE_CAPACITY + 1)
                    )
            );
        }
        return result;
    }
}
