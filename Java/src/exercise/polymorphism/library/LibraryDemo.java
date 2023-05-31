package exercise.polymorphism.library;

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];
        items[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        items[1] = new DVD("Inception", "Christopher Nolan");
        // Check out the Book and DVD
        items[0].checkOut("John");
        items[1].checkOut("Alice");

        // Display the details of each library item
        for (LibraryItem item : items) {
            item.displayDetails();
        }

        // Check in the Book and DVD
        items[0].checkIn();
        items[1].checkIn();

        // Make a reservation for the Book
        if (items[0] instanceof Reservation reservation) {
            reservation.makeReservation("Michael");
        }
    }
}
