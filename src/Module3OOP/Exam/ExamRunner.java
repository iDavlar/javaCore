package Module3OOP.Exam;

import java.util.Scanner;

public class ExamRunner {
    public static void main(String[] args) {
        House house = new House(24, 38);

        System.out.println("You house:" + house);
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        while (true) {
            System.out.println("Menu\n" +
                    "0 - Exit\n" +
                    "1 - change temperature\n" +
                    "2 - change humidity");
            answer = sc.nextInt();
            if (answer == 0) {
                break;
            }

            System.out.print("Enter value: ");
            getHouseManager(answer).manage(sc.nextInt(), house);
            System.out.println("You house:" + house);
        }
    }

    public static HouseManager getHouseManager(int id) {
        switch (id) {
            case 1:
                return new TemperatureManager();
            default:
                return new HumidityManager();
        }
    }
}
