package Module3OOP.Exam;

public class TemperatureManager extends HouseManager{
    @Override
    public Device getDevice() {
        return new Heater();
    }
}
