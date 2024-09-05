public class Ticket {
    Flight flight;
    int cost;
    String ticketNum;
    int seatNum;
    User user;
    private void printTicket() {
        System.out.println(
                String.format(
                        "Ticket Number: %s \n " +
                                "Source: %s \n" +
                                "Destination: %s \n" +
                                "Name: %s \n" +
                                "Seat number: %d \n" +
                                "Cost: %d \n", ticketNum, flight.getSource(), flight.getDestination(), user.getName(), seatNum, cost
                )
        );
    }
}
