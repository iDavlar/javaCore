package module6Threads.exam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EventStartedNotifier extends Notifier {

    private final int MAX_NOTIFICATION_COUNT = 2;

    private Map<Event, Integer> notificationCount = new HashMap<>();

    public EventStartedNotifier(EventMap eventMap) {
        super(eventMap);
    }

    @Override
    protected void modifyProcessed(Event event) {
        notificationCount.put(
                event,
                notificationCount.getOrDefault(event, 0) + 1
        );
    }

    @Override
    protected void showNotification(Event event) {
        Duration duration = Duration.between(event.getDate(), LocalDateTime.now());
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(": ");
        sb.append(event.getName());
        sb.append(" has already started!");
        sb.append(" You are late for ");
        sb.append(LocalTime.ofNanoOfDay(duration.toNanos()).format(
                DateTimeFormatter.ofPattern("HH:mm:ss")
        ));
        System.out.println(sb);
    }

    @Override
    protected boolean notifyCondition(Event event) {
        return event.isActive()
                && LocalDateTime.now().isAfter(event.getDate())
                && Duration.between(event.getDate(), LocalDateTime.now()).toSeconds() > 0
                && notificationCount.getOrDefault(event, 0) < MAX_NOTIFICATION_COUNT;
    }

    @Override
    protected boolean breakCondition() {
        return !this.getEventMap().hasInactive() && this.allEventsShowed();
    }

    private boolean allEventsShowed() {
        Collection<Integer> values = notificationCount.values();
        if (values.size() == 0) {
            return false;
        }
        for (Integer value : values) {
            if (value < MAX_NOTIFICATION_COUNT) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected int getPeriod() {
        return 60_000;
    }
}
