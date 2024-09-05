

public class Pilot extends Account {
    public Pilot(String name, int age, String phoneNum, String password, String emailId) {
        super(name, age, phoneNum, password, emailId, "pilot");
    }
    private Flight flight;
    public void confirming() {
        System.out.println("flight confirmed to fly on " + flight.getSchedule());
    }
    public void flightCanceling() {
        System.out.println("flight has been canceled");
    }
}