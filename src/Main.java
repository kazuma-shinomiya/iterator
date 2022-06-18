import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator<Book> ib = bookShelf.iterator();
        while (ib.hasNext()) {
            Book book = ib.next();
            System.out.println(book.getName());
        }
        System.out.println();

        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
