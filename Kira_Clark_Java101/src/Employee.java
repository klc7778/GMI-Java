
import java.util.*;

/**
 * 
 */
public class Employee {
	
    public static String empName;
    public static  Book book;
    public int lateFee;
    public  Date issueDate;
    public  Date returnDate;

    /**
     * Default constructor
     */
    public Employee(String empName, Book book, Date issueDate) 
    {
		super();
		this.empName = empName;
		this.book = book;
		this.issueDate = issueDate;
		
	}

	public static String getEmpName() {
		return empName;
	}

	public static void setEmpName(String empName) {
		Employee.empName = empName;
	}


	public static Book getBook() {
		return book;
	}

	public static void setBook(Book book) {
		Employee.book = book;
	}

	public int getLateFee() {
		return lateFee;
	}

	public void setLateFee(int lateFee) {
		this.lateFee = lateFee;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/**
     * @param issueDate 
     * @return
     */
    public Date rentBook(Date issueDate) {
        // TODO implement here
    	return this.issueDate = issueDate; 
    }

    
	/**
     * @param returnDate 
     * @return
     */
    public Date returnBook(Date returnDate) {
        // TODO implement here
    	return this.returnDate = returnDate;
    }

    
    
}