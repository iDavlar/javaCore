package module6Threads.exam;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OneHourBeforeEventNotifier extends Notifier {
    public OneHourBeforeEventNotifier(EventMap eventMap) {
        super(eventMap);
    }

    @Override
    protected void modifyProcessed(Event event) {

    }

    @Override
    protected void showNotification(Event event) {
        Duration duration = Duration.between(LocalDateTime.now(), event.getDate());
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(": ");
        sb.append(event.getName());
        sb.append(" will be start in ");
        sb.append(LocalTime.ofNanoOfDay(duration.toNanos()).format(
                DateTimeFormatter.ofPattern("mm:ss")
        ));
        System.out.println(sb);
    }

    @Override
    protected boolean notifyCondition(Event event) {
        Duration duration = Duration.between(LocalDateTime.now(), event.getDate());
        return duration.toMinutes() <= 60 && duration.toSeconds() >= 0;
    }

    @Override
    protected boolean breakCondition() {
        return !this.getEventMap().hasInactive();
    }
}
