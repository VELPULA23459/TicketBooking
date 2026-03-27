#  Ticket Booking System (Java Mini Project)

##  Project Overview

The Ticket Booking System is a console-based Java application developed using **Core Java and Object-Oriented Programming (OOP)** concepts.
It allows users to book tickets, view booked tickets, and manage seat availability through a simple menu-driven interface.

---

##  Technologies Used

* Java (Core Java)
* OOP Concepts (Encapsulation, Classes & Objects)
* ArrayList Collection
* Scanner Class (User Input)

---

##  Features

*  Book tickets with passenger name, show name, and seat number
*  Prevent duplicate seat bookings
*  View all booked tickets
*  Unique ticket ID generation
*  Menu-driven console application

---

##  Project Structure

```
src/
 ├── Main.java
 ├── Ticket.java
 └── TicketBookingSystem.java
```

---

##  How It Works

1. User selects an option from the menu:

* Book Ticket
* View All Tickets
* Exit

2. While booking:

* Enter passenger name
* Enter show name
* Enter seat number

3. System validation:

* Checks if seat is already booked
* Prevents duplicate bookings

4. If valid:

* Generates unique ticket ID
* Stores ticket in ArrayList
* Displays ticket details

---

##  Sample Output

```
==== Ticket Booking System ====
1. Book Ticket
2. View All Tickets
3. Exit
Enter choice: 1

Enter Passenger Name: Himaja
Enter Show Name: Movie
Enter Seat No: 5

Ticket booked successfully!
Ticket ID: 1000, Passenger: Himaja, Show: Movie, Seat: 5
```

###  View Tickets

```
Enter choice: 2

--- Booked Tickets ---
Ticket ID: 1000, Passenger: Himaja, Show: Movie, Seat: 5
```

---

##  Key Concepts Used

* Classes and Objects
* Encapsulation using getters
* ArrayList for dynamic data storage
* Looping and conditional statements
* Menu-driven program design

---

##  Future Enhancements

* GUI using Java Swing
* Database integration (MySQL)
* Online booking system
* Cancel ticket feature

---

##  Author

**Velpula Himaja**
