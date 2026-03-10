 class Ticket {
	    private int ticketId;
	    private String passengerName;
	    private String showName;
	    private int seatNo;

	    // Constructor
	    public Ticket(int ticketId, String passengerName, String showName, int seatNo) {
	        this.ticketId = ticketId;
	        this.passengerName = passengerName;
	        this.showName = showName;
	        this.seatNo = seatNo;
	    }
        public int getTicketId() {
        	return ticketId;
        }
        public String getPassengerName() {
        	return passengerName;
        }
        public String getShowname() {
        	return showName;
        }
        public int getSeatNo() {
        	return seatNo;
        }
	    // Display ticket details
	    public void displayTicket() {
	        System.out.println("Ticket ID: " + ticketId +
	                           ", Passenger: " + passengerName +
	                           ", Show: " + showName +
	                           ", Seat No: " + seatNo);
	    }
	}

