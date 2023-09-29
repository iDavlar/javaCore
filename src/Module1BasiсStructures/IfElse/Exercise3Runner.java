package Module1BasiсStructures.IfElse;

import java.util.Scanner;

public class Exercise3Runner {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        showDaysSchedule(day);
    }

    public static void showDaysSchedule(int day) {
        switch (day) {
            case 1:
                showMondaySchedule();
                break;
            case 2:
                showTuesdaySchedule();
                break;
            case 3:
                showWednesdaySchedule();
                break;
            case 4:
                showThursdaySchedule();
                break;
            case 5:
                showFridaySchedule();
                break;
            case 6:
                showSaturdaySchedule();
                break;
            case 7:
                showSundaySchedule();
                break;
            default:
                System.out.println("Такого дня нет.");

        }
    }

    private static void showMondaySchedule() {
        System.out.println("Учим Java");
    }

    private static void showTuesdaySchedule() {
        System.out.println("Встреча");
    }

    private static void showWednesdaySchedule() {
        System.out.println("Учим Java");
        System.out.println("Смотрим фильм");
    }

    private static void showThursdaySchedule() {
        System.out.println("Отдыхаем");
    }

    private static void showFridaySchedule() {
        System.out.println("не учим Java");
    }

    private static void showSaturdaySchedule() {
        System.out.println("Учим английский");
    }

    private static void showSundaySchedule() {
        System.out.println("Отдыхаем");
        System.out.println("Чилим");
    }


}
