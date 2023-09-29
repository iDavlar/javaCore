package module6Threads.exam;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event {
    private String name;
    private LocalDateTime date;
    private String description;
    private boolean isActive;

    public Event(String name, LocalDateTime date, String description, boolean isActive) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name)
                && Objects.equals(date, event.date)
                && Objects.equals(description, event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, description);
    }
}
