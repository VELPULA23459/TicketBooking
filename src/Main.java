import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBookingSystem system = new TicketBookingSystem();
        int choice;

        do {
        	System.out.println();
            System.out.println("==== Ticket Booking System ====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Show Name: ");
                    String show = sc.nextLine();
                    System.out.println("Enter Seat No:");
                    int seatNo = sc.nextInt();
                    sc.nextLine();
                    system.bookTicket(name, show, seatNo);
                    break;

                case 2:
                    system.viewAllTickets();
                    break;

                case 3:
                    System.out.println(" Exiting... Thank you!");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}


  