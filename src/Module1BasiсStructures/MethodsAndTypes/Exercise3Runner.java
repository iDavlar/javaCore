package Module1BasiсStructures.MethodsAndTypes;

public class Exercise3Runner {
    public static void main(String[] args) {
        convertPeriod(5_000_000_000L);
    }

    public static void convertPeriod(long periodInSeconds) {
        final byte SECONDS_IN_MINUTE = 60;
        final short SECONDS_IN_HOUR = SECONDS_IN_MINUTE * 60;
        final int SECONDS_IN_DAY = SECONDS_IN_HOUR * 24;
        final int SECONDS_IN_WEEK = SECONDS_IN_DAY * 7;

        long seconds = periodInSeconds;

        long weeks = periodInSeconds / SECONDS_IN_WEEK;
        seconds -= weeks * SECONDS_IN_WEEK;

        long days = seconds / SECONDS_IN_DAY;
        seconds -= days * SECONDS_IN_DAY;

        int hours = (int) seconds / SECONDS_IN_HOUR;
        seconds -= hours * SECONDS_IN_HOUR;

        int minutes = (int) seconds / SECONDS_IN_MINUTE;
        seconds -= minutes * SECONDS_IN_MINUTE;

        System.out.printf("%d это %d недель %d дней %d часов %d минут %d секунд", periodInSeconds, weeks, days, hours, minutes, seconds);
    }
}
