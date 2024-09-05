public class Flight {
    public String flightNum;
    private Pilot pilot;
    private String name;
    private String source;
    private String destination;
    private Schedule schedule;
    private int capacity;

    public String getFlightNum() {
        return flightNum;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void flightConfirming() {
        System.out.println(flightNum + " is flying on " + schedule.getDate());
    }

    public void flightCanceling() {
        System.out.println(flightNum + " which was flying on " + schedule.getDate() + " has been cancelled");
    }
}
