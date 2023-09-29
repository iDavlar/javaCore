package Module2ClassesAndObjects.ClassesAndObjects;

public class Exercise3Runner {
    public static void main(String[] args) {
        Clock clock = new Clock(15, 30);
        clock.setAlarm(16, 30);

        System.out.println("Check: " + clock.checkAlarm(16, 30));
        System.out.println("Check: " + clock.checkAlarm(16, 31));

        int timeCount = clock.checkTimeCount(99, 99);
        System.out.println("Количество звонков: " + timeCount);

        timeCount = clock.checkTimeCount(17, 00);
        System.out.println("Количество звонков: " + timeCount);

        timeCount = clock.checkTimeCount(17, 01);
        System.out.println("Количество звонков: " + timeCount);

        timeCount = clock.checkTimeCount(17, 15);
        System.out.println("Количество звонков: " + timeCount);
    }
}
