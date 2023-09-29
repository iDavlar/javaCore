package module6Threads.exam;

import java.util.concurrent.Callable;

public abstract class Notifier implements Callable<Boolean> {

    private EventMap eventMap;

    public Notifier(EventMap eventMap) {
        this.eventMap = eventMap;
    }

    public EventMap getEventMap() {
        return eventMap;
    }

    @Override
    public Boolean call() throws Exception {

        while (true) {

            synchronized (this.eventMap) {
                for (Event event : this.eventMap.values()) {
                    if (notifyCondition(event)) {
                        showNotification(event);
                        modifyProcessed(event);
                    }
                }
            }

            if (breakCondition()) {
                break;
            }

            Thread.sleep(getPeriod());
        }
        return true;
    }

    protected int getPeriod() {
        return 1000;
    }

    protected abstract void modifyProcessed(Event event);

    protected abstract void showNotification(Event event);

    protected abstract boolean notifyCondition(Event event);

    protected abstract boolean breakCondition();
}
