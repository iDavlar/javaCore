package module6Threads.exam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EventBeginningNotifier extends Notifier {
    public EventBeginningNotifier(EventMap eventMap) {
        super(eventMap);
    }

    @Override
    protected void modifyProcessed(Event event) {
        synchronized (event) {
            event.setActive(true);
        }
    }

    @Override
    protected void showNotification(Event event) {
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(": ");
        sb.append(event.getName());
        sb.append(" is beginning!");
        sb.append(" (");
        sb.append(event.getDate().format(
                DateTimeFormatter.ofPattern("dd.MM.uu HH:mm:ss")
        ));
        sb.append(")");
        System.out.println(sb);
    }

    @Override
    protected boolean notifyCondition(Event event) {
        return !event.isActive() && LocalDateTime.now().isAfter(event.getDate());
    }

    @Override
    protected boolean breakCondition() {
        return !this.getEventMap().hasInactive();
    }
}
