package Module2ClassesAndObjects.Exam;

import java.time.LocalTime;

public class TrainFinder {
    public static Train findByNumber(Train[] trains, int number) throws TrainDoesNotExist {
        for (Train train :
                trains) {
            if (train.getNumber() == number) {
                return train;
            }
        }

        throw new TrainDoesNotExist("A train with number " + number + " is not found.");
    }
}
