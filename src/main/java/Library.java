import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;


    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int bookCount() {
        return stock.size();
    }

    public void addBook(Book book) {
        if (bookCount() < capacity){
            stock.add(book);
        }
    }
}