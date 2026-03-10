import java.util.ArrayList;
import java.util.List;

class TicketBookingSystem {
    private List<Ticket> tickets = new ArrayList<>();  
    private int seatCounter = 1;   
    private int ticketCounter = 1000; 

    // Method to book a ticket
    public void bookTicket(String passengerName, String showName,int seatNo) {
    boolean seatBooked = false;
    for (Ticket t : tickets) {
    	if (t.getSeatNo() == seatNo) {
    		seatBooked = true;
    		break;
    	}
    } 	
    if (seatBooked) {
    	System.out.println("Seat " + seatNo +" is already booked");
    }
    else {
    	Ticket t = new Ticket(ticketCounter, passengerName, showName, seatNo);
        tickets.add(t);
        System.out.println("Ticket booked successfully!");
        t.displayTicket();
        ticketCounter++;
    }
}

    // Method to view all tickets
    public void viewAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
            return;
        }
        System.out.println("\n--- All Tickets ---");
        for (Ticket t : tickets) {
            t.displayTicket();
        }
    }
}



 