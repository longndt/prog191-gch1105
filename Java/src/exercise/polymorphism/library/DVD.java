package exercise.polymorphism.library;

import java.time.LocalDate;

class DVD extends LibraryItem {
    private String borrower;
    private String dueDate;

    public DVD(String title, String director) {
        super(title);
    }

    public void checkOut(String borrower) {
        this.borrower = borrower;
        // Set the due date to 7 days from today (for example)
        this.dueDate = LocalDate.now().plusDays(7).toString();
        System.out.println("DVD checked out by: " + borrower);
        System.out.println("Due Date: " + dueDate);
    }

    public void checkIn() {
        borrower = null;
        dueDate = null;
        System.out.println("DVD checked in.");
    }
}
