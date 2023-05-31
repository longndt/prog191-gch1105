package exercise.polymorphism.library;

import java.time.LocalDate;

class Book extends LibraryItem {
    private String borrower;
    private String dueDate;

    public Book(String title, String author) {
        super(title);
    }

    public void checkOut(String borrower) {
        this.borrower = borrower;
        // Set the due date to 14 days from today (for example)
        this.dueDate = LocalDate.now().plusDays(14).toString();
        System.out.println("Book checked out by: " + borrower);
        System.out.println("Due Date: " + dueDate);
    }

    public void checkIn() {
        borrower = null;
        dueDate = null;
        System.out.println("Book checked in.");
    }
}
