import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;


    @Before
    public void before(){
        book = new Book("Beyond the point", "Damien Boyd", "Thriller");
    }

    @Test
    public void hasTitle(){
        assertEquals("Beyond the point", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Damien Boyd", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Thriller", book.getGenre());
    }
}
