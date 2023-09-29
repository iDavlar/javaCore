package Module2ClassesAndObjects.Exam;

public class TrainSorter {
    public static Train[] sortByNumber(Train[] trains) {
        trains = trains.clone();

        for (int i = 1; i < trains.length; i++) {
            Train current = trains[i];
            int j = i - 1;
            while (j >= 0 && trains[j].getNumber() > current.getNumber()) {
                trains[j + 1] = trains[j];
                j--;
            }
            trains[j + 1] = current;
        }

        return trains;
    }

    public static Train[] sortByNumberReverse(Train[] trains) {

        trains = trains.clone();

        for (int i = 1; i < trains.length; i++) {
            Train current = trains[i];
            int j = i - 1;
            while (j >= 0 && trains[j].getNumber() < current.getNumber()) {
                trains[j + 1] = trains[j];
                j--;
            }
            trains[j + 1] = current;
        }

        return trains;
    }

    public static Train[] sortByDestination(Train[] trains) {

        trains = trains.clone();

        for (int i = 1; i < trains.length; i++) {
            Train current = trains[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(trains[j]) <= 0) {
                trains[j + 1] = trains[j];
                j--;
            }
            trains[j + 1] = current;
        }

        return trains;
    }
}
