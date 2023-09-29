package Module2ClassesAndObjects.Exam;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Arrays;

public class ExamRunner {
    public static void main(String[] args) {
        Train[] trains = {
                new Train(14, LocalTime.of(5, 30), "Moscow"),
                new Train(13, LocalTime.of(6, 30), "Moscow"),
                new Train(90, LocalTime.of(17, 30), "StPetersburg"),
                new Train(12, LocalTime.of(3, 30), "Moscow"),
                new Train(89, LocalTime.of(15, 30), "StPetersburg")
        };

        System.out.println("Array:");
        System.out.println(Arrays.toString(trains));

        System.out.println("Sorted by number:");
        System.out.println(Arrays.toString(TrainSorter.sortByNumber(trains)));
        System.out.println(Arrays.toString(TrainSorter.sortByNumberReverse(trains)));

        System.out.println("Found item:");
        findTrainByNumber(trains, 13);

        System.out.println("Sorted by destination:");
        System.out.println(Arrays.toString(TrainSorter.sortByDestination(trains)));
    }

    public static void findTrainByNumber(Train[] trains, int number) {
        try {
            System.out.println(TrainFinder.findByNumber(trains, number));
        } catch (TrainDoesNotExist e) {
            System.out.println(e.getMessage());
        }
    }
}
