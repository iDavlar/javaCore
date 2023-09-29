package Module2ClassesAndObjects.Exam;

import java.time.LocalTime;

public class Train {
    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(int number, LocalTime departureTime, String destination) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Train (" +
                number + ") to " +
                destination +
                " - " + departureTime;
    }

    public int compareTo(Train train) {
        int result = this.getDestination().compareTo(train.getDestination());
        if (result != 0) {
            return result;
        } else {
            return this.getDepartureTime().compareTo(train.getDepartureTime());
        }
    }
}
