package exercise.polymorphism.library;

abstract class LibraryItem {
    private final String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract void checkOut(String borrower);

    public abstract void checkIn();

    public void displayDetails() {
        System.out.println("Title: " + title);
    }
}

