
import java.util.*;

/**
 * Take input as employee details, type of book to be returned and issue date of that book.
 */
public abstract class Book {

	public static int lateFee;
    public static String bookName;

    public Book(String bookName, int fee) 
    {
    	this.bookName = bookName;
    	this.lateFee = fee; 
	}
	
	
	public void returnFine() {
        // TODO implement here
    }
	

}