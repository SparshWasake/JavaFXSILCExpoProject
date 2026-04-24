package SILCExpoProject;

public class ScheduleItem {
    private String period;
    private String className;
    private String room;

    public ScheduleItem(String period, String className, String room) {
        this.period = period;
        this.className = className;
        this.room = room;
    }

    public String getPeriod() {
        return period;
    }

    public String getClassName() {
        return className;
    }

    public String getRoom() {
        return room;
    }
}
