package CircularLinkedList.TicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(2, "Bob", "Interstellar", "B2", "12:00 PM");
        system.addTicket(3, "Charlie", "Inception", "A2", "10:00 AM");

        system.displayTickets();

        system.searchTicket("Inception");
        system.removeTicket(2);

        system.displayTickets();
        System.out.println("Total Booked Tickets: " + system.totalTickets());
    }
}

