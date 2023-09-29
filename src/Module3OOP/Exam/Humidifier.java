package Module3OOP.Exam;

public class Humidifier implements Device {
    @Override
    public void execute(int value, House house) {
        house.setHumidity(house.getHumidity() + value);
    }
}
