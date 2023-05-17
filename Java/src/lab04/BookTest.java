package lab04;

public class BookTest {
    public static void main(String[] args) {
        //khai báo OOP object (class instance)
        Author author1 = new Author("David", 1980, "david@gmail.com", "USA");
        Author author2 = new Author("Michael", 1976, "michael@gmail.com", "England");

        Book book1 = new Book ("Gone with the wind", author1, 99.99);
        Book book2 = new Book ("Rich dad poor dad", author2, 88.88);
        Book book3 = new Book ("Java Programming", author2, 68.68);

        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();

        System.out.println(author1.toString());
        System.out.println(author2.toString());

        System.out.println("Author " + author1.getName() + " has written 1 book: " + book1.getTitle());
        System.out.println("Author " + author2.getName() + " has written 2 books: " + book2.getTitle() + ", " + book3.getTitle());
    }
}
