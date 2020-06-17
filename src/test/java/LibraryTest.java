import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("Beyond the point", "Damien Boyd", "Thriller");
    }

    @Test
    public void hasBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBooksIfFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }

}
