package lab04;

public class BookDemo {
    public static void main(String[] args) {
        Author[] authors = new Author[2]; //length (size) : 2
        authors[0] = new Author("David", 1980, "david@gmail.com", "USA");
        authors[1] = new Author("Michael", 1976, "michael@gmail.com", "England");

        Book book1 = new Book ("Gone with the wind", authors[0], 99.99);
        Book book2 = new Book ("Rich dad poor dad", authors[1], 88.88);
        Book book3 = new Book ("Java Programming", authors[1], 68.68);
        Book book4 = new Book ("ReactJS Basic", authors[0], 45.67);
        Book books[] = {book1, book2, book3, book4};

        for (int i=0; i<authors.length; i++) {
            System.out.println(authors[i].toString());
        }

        for (Book book: books) {
            book.showBookInfo();
        }

    }
}
