package lab04;

public class Book {
    //attributes (variables)
    private String title;
    private Author author;
    private double price;

    //operations (methods)
    //1. constructor
    public Book () {}
    public Book (String t, Author a, double p) {
       title = t;
       author = a;
       price = p;
    }

    //2. getter (observer)
    public String getTitle () {
        return title;
    }
    public Author getAuthor () {
        return author;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public double getPrice() {
        return price;
    }

    //3. setter (mutator)
    public void setTitle (String t) {
        title = t;
    }

    public void setAuthor (Author a) {
        author = a;
    }

    public void setPrice (double p) {
        price = p;
    }

    //4. other methods
    public void showBookInfo () {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Birthyear: " + author.getBirth_year());
    }

    public void compareBook (Book book) {
//        if (this.title == book.title && this.author == book.author && this.price == book.price) {
//            System.out.println("2 books are similar");
//        } else {
//            System.out.println("2 books are different");
//        }
        if (this.title == book.title) {
            if (this.author == book.author) {
                if (this.price == book.price) {
                    System.out.println("2 books are similar");
                }
            }
        } else {
            System.out.println("2 books are different");
        }
    }

    public void comparev1 (Book book) {
        if (this.title == book.title) {
            System.out.println("Title is similar");
        } else {
            System.out.println("Title is different");
        }
        if (this.author == book.author) {
            System.out.println("Author is similar");
        } else {
            System.out.println("Author is different");
        }
        if (this.price == book.price) {
            System.out.println("Price is similar");
        } else {
            System.out.println("Price is different");
        }
    }

    public boolean equalsBook (Book book) {
        if (this.title == book.title && this.author == book.author && this.price == book.price) {
           return true;
        } else {
            return false;
        }
    }
}
