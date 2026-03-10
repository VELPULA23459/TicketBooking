# Ticket Booking System (Java Mini Project)

## Project Description
This is a console-based Ticket Booking System developed using Java.  
The application allows users to book tickets, check booked tickets, and manage seat availability through a simple menu-driven interface.

## Features
- Book a ticket with passenger name, show name, and seat number
- Prevent duplicate seat bookings
- View all booked tickets
- Unique ticket ID generated for each ticket
- Menu-driven console interface

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList Collection
- Scanner Class for user input

## Project Structure
src
 ├── Main.java
 ├── Ticket.java
 └── TicketBookingSystem.java

## How the Program Works
1. The program displays a menu with options:
   - Book Ticket
   - View All Tickets
   - Exit

2. When booking a ticket:
   - User enters passenger name
   - User enters show name
   - User enters seat number
   - System checks if the seat is already booked

3. If the seat is available:
   - Ticket is created with a unique Ticket ID
   - Ticket details are stored in an ArrayList
   - Ticket details are displayed

4. Users can view all booked tickets anytime.

## Example Output
==== Ticket Booking System ====
1. Book Ticket
2. View All Tickets
3. Exit
Enter choice: 1

Enter Passenger Name: Himaja
Enter Show Name: Movie
Enter Seat No: 5

Ticket booked successfully!
Ticket ID: 1000, Passenger: Himaja, Show: Movie, Seat No: 5

## Learning Outcomes
- Understanding Java classes and objects
- Implementing encapsulation with getters
- Using ArrayList to store objects
- Implementing menu-driven console applications
- Basic project structure in Java

## Author
Velpula Himaja
B.Tech - Electronics and Communication Engineering
