package Module3OOP.Exam;

public class HumidityManager extends HouseManager {

    @Override
    public Device getDevice() {
        return new Humidifier();
    }
}
