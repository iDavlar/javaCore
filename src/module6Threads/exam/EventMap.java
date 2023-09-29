package module6Threads.exam;

import java.util.HashMap;

public class EventMap extends HashMap<String, Event> {
    public Event put(Event event) {
        return super.put(event.getName(), event);
    }

    public boolean hasInactive() {
        for (Event event : this.values()) {
            if (!event.isActive()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasActive() {
        for (Event event : this.values()) {
            if (event.isActive()) {
                return true;
            }
        }
        return false;
    }
}
