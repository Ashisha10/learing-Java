public class Schedule {
    private String date;
    private String time;

    public Schedule(String date, String time) {
        this.date = date;
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public boolean isFlying(boolean isConfirm) {
        return isConfirm;
    }
}
