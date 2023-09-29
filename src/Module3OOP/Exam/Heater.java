package Module3OOP.Exam;

public class Heater implements Device {
    @Override
    public void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }
}
