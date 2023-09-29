package Module2ClassesAndObjects.ClassesAndObjects;

public class Clock {
    private int alarmHours;
    private int alarmMinutes;

    public Clock(int alarmHours, int alarmMinutes) {
        this.setAlarmHours(alarmHours);
        this.setAlarmMinutes(alarmMinutes);
    }

    public int getAlarmHours() {
        return alarmHours;
    }

    public void setAlarmHours(int alarmHours) {
        this.alarmHours = correctHour(alarmHours);
    }

    public int getAlarmMinutes() {
        return alarmMinutes;
    }

    public void setAlarmMinutes(int alarmMinutes) {
        this.alarmMinutes = correctMinutes(alarmMinutes);
    }

    public String setAlarm(int hours, int minutes) {
        this.setAlarmHours(hours);
        this.setAlarmMinutes(minutes);
        return "будильник становлен на " + this.getAlarmHours() + ":" + this.getAlarmMinutes();
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == this.alarmHours && minutes == this.alarmMinutes) {
            return "Chime";
        }
        return "";
    }

    public int checkTimeCount(int hours, int minutes) {
        hours = correctHour(hours);
        minutes = correctMinutes(minutes);
        if (minutes == 0) {
            if (hours == 0) {
                return 12;
            }
            if (hours > 12) {
                hours -= 12;
            }
            return hours;

        } else if (minutes == 15) {
            return 1;
        }
        return 0;
    }

    protected int correctHour(int hours) {
        if (hours < 0 || hours > 23) {
            hours = 0;
        }
        return hours;
    }

    protected int correctMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
        return minutes;
    }

}
