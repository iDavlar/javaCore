package module9Exam.exercise3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value
public class Car {
    public static final int MAX_ENGINE_CAPACITY = 3;
    public static final int MIN_ENGINE_CAPACITY = 1;
    String name;
    CarModel carModel;
    int engineCapacity;
}
