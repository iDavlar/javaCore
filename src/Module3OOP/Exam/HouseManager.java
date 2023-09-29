package Module3OOP.Exam;

public abstract class HouseManager {

    public void manage(int value, House house) {
        Device device = getDevice();
        device.execute(value, house);
    }

    public abstract Device getDevice();
}
